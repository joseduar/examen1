package com.example.ana.todojose.database.models;

import com.example.ana.todojose.database.Tododatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by ANA on 05/02/2018.
 */

@Table(database = Tododatabase.class)
public class TodoTable extends BaseModel {

    // aqui declaramos nuestra tabla

    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public String nombre;

    @Column
    public String actividad;

    @Column
    public int estado;
}
