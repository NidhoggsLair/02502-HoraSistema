/* 
 * Copyright 2020 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Date;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static void main(String[] args) {
//      Usamos el metodo Date
        Date d = new Date();
//      Usando un print el %tT te lo muestra en formato hh:mm:ss sin necesidad
//      de formatear a mano, la primera t minuscula, la segunda mayúscula
        System.out.printf("Hora del sistema ...: %tT%n", d);

        System.out.println("---");

//      De la siguiente manera indicamos a mano el orden que queremos la hora
//      pudiendo alternar a gusto el lugar de las horas, minutos y segundos
        System.out.printf("Hora del sistema ...: %tS:%tM:%tH %n", d, d, d);
    }

}
