CREATE TABLE T_AUTEUR(id int PRIMARY KEY, prenom VARCHAR(30), nom VARCHAR(30));
CREATE TABLE T_LIVRE(id int PRIMARY KEY, titre VARCHAR(30), fk_auteur int, FOREIGN KEY (fk_auteur) REFERENCES T_AUTEUR(id));
