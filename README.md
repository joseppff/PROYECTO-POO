# PROYECTO-POO
PROYECTO POO GRUPO JOSE PEÑA - DIEGO MARTINEZ - JESUS VASQUEZ

//// Pasos previos

Para el correcto uso de la aplicacion y posterior enlace con la base de datos se debe importar en la pagina administrador de xampp el archivo 'sistemabuses.sql'  a una base de datos con el nombre 'sistemabuses'.

//// Como abrir?

Ejecute el archivo Aplicacion para iniciar el proyecto

/// Ventana inicio sesion.

Datos de inicio de sesion

correo : 'pruebaProyecto@pucv.cl'

contraseña : '123'

/// ventana menu.

Se tienen 4 opciones las cuales:

-Conductores: Abre la ventana conductores en la cual se puede crear, modificar, buscar, eliminar un conductor. Este conductor puede o no asignarse a un bus a traves de una patente.

    Eliminar un Conductor no lo elimina de la base de datos permanentemente si no que mantiene sus datos
    y crea un nuevo Conductor con el Rut en cuestion con los datos nulos, de modo que al buscar este
    Conductor aparezcan sus datos como null.

    Para buscar un Conductor solo se necesita el rut.

-Buses: Abre la ventana buses en la cual se puede crear, modificar, buscar, eliminar un bus. Este bus puede o no asignarse a un recorrido existente.

    Eliminar un Bus no lo elimina de la base de datos permanentemente si no que mantiene sus datos
    y crea un nuevo Bus con la patente en cuestion con los datos nulos, de modo que al buscar este
    Bus aparezcan sus datos como null.

    Para buscar un Bus solo se necesita la patente.


-Reporte conductor: Abre una ventana con una tabla en la cual se pueden cargar los datos de almacenados en la base de datos, datos previamente creados con la ventana conductor apareceran aqui y estaran tambien almacenados en la base de datos.

-Reporte bus: Abre una ventana con una tabla en la cual se pueden cargar los datos de almacenados en la base de datos, datos previamente creados con la ventana buses apareceran aqui y estaran tambien almacenados en la base de datos.
