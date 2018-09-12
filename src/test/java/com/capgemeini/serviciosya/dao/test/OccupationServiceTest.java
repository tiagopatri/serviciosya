
package com.capgemeini.serviciosya.dao.test;


import org.apache.log4j.Logger;

import org.junit.Assert;
import org.junit.Test;

import com.capgemeini.serviciosya.beans.domain.Occupation;
import com.capgemeini.serviciosya.dao.IOccupationDao;
import com.capgemeini.serviciosya.dao.OccupationDaoJDBC;

import java.util.List;


public class OccupationServiceTest {


    private static final Logger logger = Logger.getLogger (OccupationServiceTest.class);


    @Test
    public void testAdd () {

        try {

            // Insert new value.
            logger.info ("Starting occupation add test.");
            IOccupationDao dao = new OccupationDaoJDBC ();

            logger.debug ("Inserting new occupation.");
            Occupation c = new Occupation ();
            c.setName ("Encantador de suegras.");
            c.setDescription ("Amo el peligro");
            dao.add (c);

           logger.debug ("Checking test result.");
           List<Occupation> list = dao.findAllOccupations ();

           boolean r = Boolean.FALSE;

           for (Occupation item: list) {

               if (item.getName ().equals (c.getName ())) {
                   r = Boolean.TRUE;
                   break;
               }
           }

           logger.info ("Finishing the test...");
           Assert.assertTrue ("Failure inserting new Occupation.", r);


        } catch (Exception e) {

            Assert.assertNull (e);
        }
    }

}