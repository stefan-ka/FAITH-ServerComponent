-- ------ insert FACILITY CATEGORIES -------
-- Einfuegen: Behindertenheim
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Behindertenheim');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Home for the handicapped');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Foyer pour Handicapés');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Cottolengo');
insert into facility_category (id, name_string_id) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string));

-- Einfuegen: Jugendheim
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Jugendheim');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Youth center');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Foyer de jeunes');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Ostello');
insert into facility_category (id, name_string_id) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string));

-- Einfuegen: Kinderheim
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Kinderheim');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Children''s home');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Foyer d''enfants');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Collegio infantile');
insert into facility_category (id, name_string_id) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string));

-- Einfuegen: Therapie und Rehabiliation
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Therapie und Rehabilitation');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Therapy and rehabilitation');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Thérapie et réhabilitation');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Terapia e riabilitazione');
insert into facility_category (id, name_string_id) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string));

-- Einfuegen: Waisenhaus
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Waisenhaus');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Orphanage');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Orphelinat');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Orfanotrofio');
insert into facility_category (id, name_string_id) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string));

-- Einfuegen: Obdachlosenhaus
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Obdachlosenhaus');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Hostel for the homeless');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Foyer d''hébergement');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Albergo dei poveri');
insert into facility_category (id, name_string_id) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string));

