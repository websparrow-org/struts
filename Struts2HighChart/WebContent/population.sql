CREATE TABLE population (
    country_name       VARCHAR2(30),
    state_name         VARCHAR2(30),
    state_population   NUMBER(6)
);

INSERT INTO population VALUES ( 'INDIA','NEW DELHI',23233 );

INSERT INTO population VALUES ( 'INDIA','UTTAR PRADESH',88383 );

INSERT INTO population VALUES ( 'INDIA','GOA',7364 );

INSERT INTO population VALUES ( 'INDIA','RAJASTHAN',7477 );

INSERT INTO population VALUES ( 'INDIA','MAHARASHTRA',8484 );

INSERT INTO population VALUES ( 'INDIA','GUJRAT',232 );

COMMIT;