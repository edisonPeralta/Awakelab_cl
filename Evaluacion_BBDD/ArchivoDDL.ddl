-- Generado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   en:        2020-03-13 17:54:52 CLST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE alternativas (
    id_alternativa      INTEGER NOT NULL,
    descripcion         VARCHAR2(100),
    valor_logico        CHAR(1),
    valor_porcentual    INTEGER,
    preguntas_id_unico  INTEGER NOT NULL,
    test_id_test        INTEGER NOT NULL
)
LOGGING;

ALTER TABLE alternativas ADD CONSTRAINT alternativas_pk PRIMARY KEY ( id_alternativa );

CREATE TABLE curso (
    id_curso      INTEGER NOT NULL,
    nombre_curso  VARCHAR2(100)
)
LOGGING;

ALTER TABLE curso ADD CONSTRAINT curso_pk PRIMARY KEY ( id_curso );

CREATE TABLE estudiante (
    rut             VARCHAR2(10) NOT NULL,
    nombre          VARCHAR2(20),
    apellido        VARCHAR2(20),
    curso_id_curso  INTEGER NOT NULL
)
LOGGING;

ALTER TABLE estudiante ADD CONSTRAINT estudiante_pk PRIMARY KEY ( rut );

CREATE TABLE preguntas (
    id_preguntas  INTEGER NOT NULL,
    enunciado     VARCHAR2(200),
    puntaje       INTEGER,
    test_id_test  INTEGER NOT NULL
)
LOGGING;

ALTER TABLE preguntas ADD CONSTRAINT preguntas_pk PRIMARY KEY ( id_preguntas );

CREATE TABLE repuestas (
    id_respuestas   INTEGER NOT NULL,
    num_pregunta    INTEGER,
    alternativas    VARCHAR2(2),
    estudiante_rut  VARCHAR2(10) NOT NULL
)
LOGGING;

ALTER TABLE repuestas ADD CONSTRAINT repuestas_pk PRIMARY KEY ( id_respuestas );

CREATE TABLE test (
    id_test         INTEGER NOT NULL,
    nombre          VARCHAR2(30),
    descripcion     VARCHAR2(100),
    programa        VARCHAR2(100),
    unidad          VARCHAR2(100),
    autor           VARCHAR2(100),
    fecha_creacion  VARCHAR2(10),
    curso_id_curso  INTEGER NOT NULL
)
LOGGING;

ALTER TABLE test ADD CONSTRAINT test_pk PRIMARY KEY ( id_test );

ALTER TABLE alternativas
    ADD CONSTRAINT alternativas_preguntas_fk FOREIGN KEY ( preguntas_id_unico )
        REFERENCES preguntas ( id_preguntas )
    NOT DEFERRABLE;

ALTER TABLE alternativas
    ADD CONSTRAINT alternativas_test_fk FOREIGN KEY ( test_id_test )
        REFERENCES test ( id_test )
    NOT DEFERRABLE;

ALTER TABLE estudiante
    ADD CONSTRAINT estudiante_curso_fk FOREIGN KEY ( curso_id_curso )
        REFERENCES curso ( id_curso )
    NOT DEFERRABLE;

ALTER TABLE repuestas
    ADD CONSTRAINT repuestas_estudiante_fk FOREIGN KEY ( estudiante_rut )
        REFERENCES estudiante ( rut )
    NOT DEFERRABLE;

ALTER TABLE test
    ADD CONSTRAINT test_curso_fk FOREIGN KEY ( curso_id_curso )
        REFERENCES curso ( id_curso )
    NOT DEFERRABLE;



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             6
-- CREATE INDEX                             0
-- ALTER TABLE                             11
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
