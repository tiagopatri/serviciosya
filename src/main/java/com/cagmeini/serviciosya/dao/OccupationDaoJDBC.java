
package com.cagmeini.serviciosya.dao;


import com.cagmeini.serviciosya.beans.domain.Occupation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;


public class OccupationDaoJDBC implements IOccupationDao {



    public OccupationDaoJDBC() {

        super ();
    }

    @Override
    public List<Occupation> findAllOccupations () {

        return null;
    }

    @Override
    public void add (Occupation occupation) {

        try {

            Connection conn = CapgeminiDB.getConnection ();

        } catch (Exception e) {

            throw new DaoException (e.getMessage(), e);
        }
    }
}