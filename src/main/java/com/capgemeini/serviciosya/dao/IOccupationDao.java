
package com.capgemeini.serviciosya.dao;


import java.util.List;

import com.capgemeini.serviciosya.beans.domain.Occupation;


public interface IOccupationDao {


    List<Occupation> findAllOccupations ();

    void add (Occupation occupation);

}
