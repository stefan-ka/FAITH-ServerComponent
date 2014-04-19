-- ------ insert sub categories -------
-- Einfuegen: Schränke (Sub von Aufbewahrung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Schränke');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Cabinets');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Armoires');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Armadi');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Aufbewahrung'));

-- Einfuegen: Kleideraufbewahrung (Sub von Aufbewahrung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Kleideraufbewahrung');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Clothes storage');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Le stockage des vêtements');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Riporre i vestiti');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Aufbewahrung'));

-- Einfuegen: Sofas (Sub von Sitzen)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sofas');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Sofas');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Canapés');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Divani');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Sitzen'));

-- Einfuegen: Stühle (Sub von Sitzen)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Stühle');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Chairs');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Chaises');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Sedie');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Sitzen'));

-- Einfuegen: Garten (Sub von Sonstige)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Garten');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Garden');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Jardin');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Giardino');
insert into furniture_category (id, name_string_id, parent) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Sonstige'));

