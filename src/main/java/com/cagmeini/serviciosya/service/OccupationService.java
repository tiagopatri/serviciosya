
package com.cagmeini.serviciosya.service;


import java.util.List;

import com.cagmeini.serviciosya.beans.domain.Occupation;
import com.cagmeini.serviciosya.dao.OccupationDao;


public class OccupationService {


    private OccupationDao occupationDao = new OccupationDao ();


    public List<Occupation> findAllOccupations () {

        return this.occupationDao.findAllOccupations ();
    }
}