-- ------ insert ROOT CATEGORIES -------
-- Einfuegen: Aufbewahrung
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Aufbewahrung');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Storage');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Stockage');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Conservazione');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), null);
-- Einfuegen: Beleuchtung
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Beleuchtung');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Lighting');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Éclairage');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Illuminazione');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), null);
-- Einfuegen: Betten
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Betten');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Bed');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Lit');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Letto');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), null);
-- Einfuegen: Sitzen
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sitzen');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Sit');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'S''asseoir');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Sedersi');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), null);
-- Einfuegen: Tische
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Tische');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Tables');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Tableaux');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Tabelle');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), null);
-- Einfuegen: Sonstige
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sonstige');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Other');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Autre');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Altro');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), null);
