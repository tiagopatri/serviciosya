
package com.cagmeini.serviciosya.service.test;


import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.cagmeini.serviciosya.beans.domain.Occupation;
import com.cagmeini.serviciosya.service.OccupationService;


public class OccupationServiceTest {


    private OccupationService occupationService = new OccupationService ();


    @Test
    public void testFindAllOccupations () {


        List<Occupation> list = this.occupationService.findAllOccupations ();

        Assert.assertFalse (list.isEmpty ());
    }
}