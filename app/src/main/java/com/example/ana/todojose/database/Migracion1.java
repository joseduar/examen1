package com.example.ana.todojose.database;

import com.example.ana.todojose.database.models.TodoTable;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.Migration;
import com.raizlabs.android.dbflow.sql.SQLiteType;
import com.raizlabs.android.dbflow.sql.migration.AlterTableMigration;

/**
 * Created by ANA on 26/02/2018.
 */
@Migration(version = 3, database = Tododatabase.class)

public class Migracion1 extends AlterTableMigration<TodoTable> {
    public Migracion1(Class<TodoTable> table) {
        super(table);
    }

    @Override
    public void onPreMigrate() {
        super.onPreMigrate();
        // aqui le decimos todo lo que queremos que aga
        addColumn(SQLiteType.INTEGER,"estado");
    }
}
