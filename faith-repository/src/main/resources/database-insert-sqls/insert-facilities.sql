-- ------ insert FACILITIES -------
-- Einfuegen: Behindertenheime
insert into facility (id, city, country, email, level, name, phone, street, zip, facility_category, user_account) 
	values (nextval('hibernate_sequence'), 'Münchenstein', 'Schweiz', 'leitung.wg.m-stein@bluewin.ch', 1, 'Wohngruppen für Behinderte Kinder', '061 411 46 11', 'Zollweidenstrasse 13', '4142', 20, 1);