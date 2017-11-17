/**
 * geo-platform
 * Rich webgis framework
 * http://geo-platform.org
 * ====================================================================
 * <p>
 * Copyright (C) 2008-2017 geoSDI Group (CNR IMAA - Potenza - ITALY).
 * <p>
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details. You should have received a copy of the GNU General
 * Public License along with this program. If not, see http://www.gnu.org/licenses/
 * <p>
 * ====================================================================
 * <p>
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library. Thus, the terms and
 * conditions of the GNU General Public License cover the whole combination.
 * <p>
 * As a special exception, the copyright holders of this library give you permission
 * to link this library with independent modules to produce an executable, regardless
 * of the license terms of these independent modules, and to copy and distribute
 * the resulting executable under terms of your choice, provided that you also meet,
 * for each linked independent module, the terms and conditions of the license of
 * that module. An independent module is a module which is not derived from or
 * based on this library. If you modify this library, you may extend this exception
 * to your version of the library, but you are not obligated to do so. If you do not
 * wish to do so, delete this exception statement from your version.
 */
package org.geosdi.geoplatform.core.dao.impl;

import org.geosdi.geoplatform.core.dao.GSAccountDAO;
import org.geosdi.geoplatform.core.model.GSAccount;
import org.geosdi.geoplatform.persistence.dao.exception.GPDAOException;
import org.geosdi.geoplatform.persistence.dao.jpa.GPAbstractJpaDAO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * @author Nazzareno Sileno <nazzareno.sileno@geosdi.org>
 * @author Giuseppe La Scaleia <giuseppe.lascaleia@geosdi.org>
 */
@Repository(value = "gsAccountDAO")
@Profile(value = "jpa")
class GSAccountDAOImpl extends GPAbstractJpaDAO<GSAccount, Long> implements GSAccountDAO {

    public GSAccountDAOImpl() {
        super(GSAccount.class);
    }

    /**
     * @param id
     * @return {@link Boolean}
     * @throws GPDAOException
     */
    @Override
    public Boolean removeById(Long id) throws GPDAOException {
        return (super.deleteByID(id) == 1 ? TRUE : FALSE);
    }

    /**
     * @param authkey
     * @return {@link GSAccount}
     * @throws GPDAOException
     */
    @Override
    public GSAccount findGSUserNameByAuthkey(String authkey) throws GPDAOException {
        checkArgument(((authkey != null) && !(authkey.isEmpty())),
                "The Parameter authkey must not be null or an empty string.");
        try {
            CriteriaBuilder builder = super.getCriteriaBuilder();
            CriteriaQuery<GSAccount> criteriaQuery = super.createCriteriaQuery();
            Root<GSAccount> root = criteriaQuery.from(this.persistentClass);
            criteriaQuery.select(root);
            criteriaQuery.where(builder.equal(root.get("authkey"), authkey));
            List<GSAccount> gsAccounts = this.entityManager.createQuery(criteriaQuery).getResultList();
            return ((gsAccounts != null) && !(gsAccounts.isEmpty()) ? gsAccounts.get(0) : null);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new GPDAOException(ex);
        }
    }
}
