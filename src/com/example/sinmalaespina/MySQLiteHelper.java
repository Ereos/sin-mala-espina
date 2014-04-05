package com.example.sinmalaespina;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
 
public class MySQLiteHelper extends SQLiteOpenHelper {
 
	// Books table name
    private static final String TABLE_ANIMAL = "animal";
    private static final String TABLE_DESC = "descripciones";

    // Books Table Columns names
    private static final String ANIMAL_ID = "id";
    private static final String ANIMAL_NOM = "nombre";
    private static final String ANIMAL_NCIENT = "n_cientifico";
    private static final String ANIMAL_CATEG = "categoria";

    private static final String DESC_ID = "id";
    private static final String DESC_IDANIMAL = "id_animal";
    private static final String DESC_TIPO = "tipo";
    private static final String DESC_DESCRIPCION = "descripcion";
    
    
    private static final String[] COLUMNS_ANIMAL = {ANIMAL_ID,ANIMAL_NOM,ANIMAL_NCIENT,ANIMAL_CATEG};
    private static final String[] COLUMNS_DESC = {DESC_ID,DESC_IDANIMAL,DESC_TIPO,DESC_DESCRIPCION};
	
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "peces";
 
    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION); 
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL statement to create book table
        String CREATE_TABLE = "CREATE TABLE 'animal' ('id' INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE , 'nombre' VARCHAR, 'n_cientifico' VARCHAR, 'categoria' VARCHAR)');";
 
        db.execSQL(CREATE_TABLE);
        CREATE_TABLE = "CREATE TABLE 'descripciones' ('id' INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE , 'id_animal' INTEGER NOT NULL, 'tipo' INTEGER NOT NULL , 'descripcion' TEXT, FOREIGN KEY (id_animal) REFERENCES animal(id))');";
        db.execSQL(CREATE_TABLE);
        CREATE_TABLE = "INSERT INTO \"animal\" VALUES (\"1\",\"At�n rojo\",\"Thunnus thynnus\",\"Pez\");"
        		+ "INSERT INTO \"animal\" VALUES (\"2\",\"Boqueron Anchoa\",\"Engraulis encrasicolus\",\"Pez\");"
        		+ "INSERT INTO \"animal\" VALUES (\"3\",\"Bonito\",\"Sarda sarda\",\"Pez\");"
        		+ "INSERT INTO \"animal\" VALUES (\"4\",\"Pulpo\",\"Octopus vulgaris\",\"Molusco\");"
        		+ "INSERT INTO \"animal\" VALUES (\"5\",\"Rodaballo\",\"Scophthalmus maximus\",\"Pez\");"
        		+ "INSERT INTO \"animal\" VALUES (\"6\",\"Merluza europea com�n\",\"Merluccius merluccius\",\"Pez\");"
        		+ "INSERT INTO \"animal\" VALUES (\"7\",\"Langostino mediterr�neo\",\"Melicertus kerathurus\",\"Crust�ceo\");"
        		+ "INSERT INTO \"animal\" VALUES (\"8\",\"Berberecho\",\"Cerastoderma edule\",\"Molusco\");"
        		+ "INSERT INTO \"animal\" VALUES (\"9\",\"Mejill�n com�n y del Atl�ntico\",\"Mytilus galloprovincialis y Mytilus edulis\",\"Molusco\");"
        		+ "INSERT INTO \"animal\" VALUES (\"10\",\"Lenguado europeo\",\"Solea solea\",\"Pez\");"
        		+ "INSERT INTO \"animal\" VALUES (\"11\",\"Caballa\",\"Scomber scombrus\",\"Pez\");"
        		+ "INSERT INTO \"animal\" VALUES (\"12\",\"Dorada\",\"Sparus aurata\",\"Pez\");";
        db.execSQL(CREATE_TABLE);
        CREATE_TABLE = "INSERT INTO \"descripciones\" VALUES (\"1\",\"1\",\"3\",\"Especie en peligro cr�tico de extinci�n. Evitar, tanto si es salvaje como de cultivo, hasta que no se asegure la recuperaci�n de sus poblaciones a niveles saludables\");"
        		+ "INSERT INTO \"descripciones\" VALUES (\"2\",\"1\",\"4\",\"Aunque no sea sostenible, es preferible elegir los ejemplares capturados por la pesca artesanal de nuestro litoral (mediante ca�as y l�neas de mano, palangre o trampas)\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"3\",\"2\",\"2\",\"Elegir preferiblemente la anchoa del Golfo de Vizcaya (Atl�ntico Noreste) mediante redes de enmalle o cerco y a condici�n de que los ejemplares sean superiores a los 11 cm\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"4\",\"2\",\"3\",\"Evitar cuando proceda del Mediterr�neo, puesto que la presi�n pesquera contin�a siendo excesivamente elevada. A su vez, se recomienda evitar los ejemplares procedentes de caladeros lejanos y de la flota industrial espa�ola en la costa africana\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"5\",\"3\",\"2\",\"Siempre y cuando los ejemplares sean frescos y grandes (sup. a los 41 cm o 2 kg) y procedan de la pesca artesanal mediante l�neas de mano y trampas\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"6\",\"3\",\"3\",\"Evitar el bonito procedente de las flotas de cerco industrial y de arrastre pel�gico\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"7\",\"4\",\"2\",\"Elegir �nicamente los ejemplares frescos y grandes (sup. a los 1 kg/Ud.), capturados mediante l�neas y anzuelos, trampas, nasas y otros m�todos artesanales de nuestro litoral\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"8\",\"4\",\"3\",\"Evitar las capturas procedentes de la flota de arrastre, las importaciones de pa�ses lejanos y de la flota espa�ola en las costas africanas\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"9\",\"5\",\"2\",\"Salvaje: Siempre y cuando sean ejemplares frescos y grandes (sup. a los 30 cm), y procedan de la flota artesanal de nuestro litoral (mediante l�neas y anzuelos o redes de enmalle)\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"10\",\"5\",\"2\",\"Cultivo: Es preferible que hayan sido criados en tanques en tierra\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"11\",\"5\",\"3\",\"Evitar el rodaballo salvaje hasta que no se garantice una explotaci�n sostenible, especialmente cuando proceda de la pesca de arrastre y cerco, y el rodaballo de acuicultura intensiva, especialmente cuando su producci�n tenga lugar en jaulas en el mar\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"12\",\"6\",\"2\",\"A condici�n de que los ejemplares sean frescos y maduros (sup. a los 50 cm), procedan del Atl�ntico Noreste y hayan sido capturados con artes de anzuelo\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"13\",\"6\",\"3\",\"Evitar los �pezque�ines� y los ejemplares capturados mediante arrastre\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"14\",\"7\",\"2\",\"A condici�n de que sea fresco y proceda de la pesca artesanal de nuestro litoral, mediante redes de enmalle o nasas u otras trampas\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"15\",\"7\",\"3\",\"Evitar cuando proceda de la flota de arrastre y de las importaciones\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"16\",\"7\",\"3\",\"Evitar el consumo de langostinos tropicales (langostinos jumbo, langostinos tigres o langostinos blancos), salvajes o de cultivo (aunque est�n certificado), por los elevados impactos ambientales y sociales asociados\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"17\",\"8\",\"1\",\"Siempre y cuando procedan del marisqueo a pie y del resto de artes tradicionales, as� como de la acuicultura extensiva. Nunca de furtivos\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"18\",\"9\",\"1\",\"Priorizar los mejillones cultivados a nivel nacional, especialmente cuando est� certificada como ecol�gica, y si es salvaje, cuando proceda exclusivamente de mariscadores con licencia. Nunca de furtivos\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"19\",\"10\",\"2\",\"Salvaje: Siempre y cuando los ejemplares sean frescos y maduros (sup. a los 30 cm) y hayan sido capturados mediante redes de enmalle u otros m�todos de pesca artesanal de nuestro litoral. Priorizando, cuando sea posible, los ejemplares procedentes del Golfo de Vizcaya\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"20\",\"10\",\"2\",\"Cultivo: Elegir �nicamente el lenguado senegal�s criado en tanques en tierra\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"21\",\"10\",\"3\",\"Debido a las elevadas tasas de descartes, independientemente del tama�o y la procedencia, se recomienda evitar el lenguado capturado mediante arrastre\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"22\",\"11\",\"2\",\"Es preferible que sean ejemplares frescos y grandes (sup. a los 30 cm), capturados mediante redes de enmalle o cerco litoral\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"23\",\"11\",\"3\",\"Evitar el consumo cuando proceda de la pesca de arrastre y de la flota industrial en caladeros africanos\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"24\",\"12\",\"2\",\"Salvaje: Preferible elegir �nicamente los ejemplares frescos y grandes (sup. a los 40 cm), capturados en nuestro litoral mediante trampas, redes de enmalle o palangre\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"25\",\"12\",\"1\",\"Cultivo: Siempre y cuando los ejemplares hayan sido criados en sistemas extensivos y alimentados de forma natural en lagunas costeras\");"
        				+ "INSERT INTO \"descripciones\" VALUES (\"26\",\"12\",\"3\",\"Evitar la dorada capturada mediante arrastre o producida en acuicultura intensiva\");";
        db.execSQL(CREATE_TABLE);
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older books table if existed
        db.execSQL("DROP TABLE IF EXISTS animal");
        db.execSQL("DROP TABLE IF EXISTS descripciones");
 
        // create fresh books table
        this.onCreate(db);
    }
    
    public Animal getAnimal(int id){
    	 
        // 1. get reference to readable DB
        SQLiteDatabase db = this.getReadableDatabase();
     
        // 2. build query
        Cursor cursor =
                db.query(TABLE_ANIMAL, // a. table
                COLUMNS_ANIMAL, // b. column names
                " id = ?", // c. selections
                new String[] { String.valueOf(id) }, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit
     
        // 3. if we got results get the first one
        if (cursor != null)
            cursor.moveToFirst();
     
        // 4. build book object
        Animal animal = new Animal();
        animal.setNombre(cursor.getString(1));
        animal.setN_cientifico(cursor.getString(2));
        animal.setCategoria(cursor.getString(3));
     
        //log
    Log.d("getAnimal("+id+")", animal.toString());
     
    Cursor cursor1 =
            db.query(TABLE_DESC, // a. table
            COLUMNS_DESC, // b. column names
            " id_animal = ?", // c. selections
            new String[] { String.valueOf(id) }, // d. selections args
            null, // e. group by
            null, // f. having
            null, // g. order by
            null); // h. limit
        // 5. return book
        return animal;
    }
 
    public List<Animal> getAllBooks() {
        List<Animal> books = new LinkedList<Animal>();
  
        // 1. build the query
        String query = "SELECT  * FROM " + TABLE_ANIMAL;
  
        // 2. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
  
        // 3. go over each row, build book and add it to list
        Animal animal = null;
        if (cursor.moveToFirst()) {
            do {
                animal = new Animal();
                animal.(cursor.getString(1));
                animal.setAuthor(cursor.getString(2));
  
                // Add book to books
                books.add(book);
            } while (cursor.moveToNext());
        }
  
        Log.d("getAllBooks()", books.toString());
  
        // return books
        return books;
    }		
}