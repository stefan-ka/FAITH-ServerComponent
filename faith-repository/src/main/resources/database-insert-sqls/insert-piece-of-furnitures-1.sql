-- ------ insert piece of furnitures -------
-- Einfuegen: Wohnwand (Moebelstueck in Kategorie Schränke)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Wohnwand');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Room wall');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Paroi de la chambre');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Parete della stanza');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Schränke'), 0);

-- Einfuegen: Regal (Moebelstueck in Kategorie Aufbewahrung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Regal');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Regal');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Royal');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Regale');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Aufbewahrung'), 0);

-- Einfuegen: Vitrine (Moebelstueck in Kategorie Schränke)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Vitrine');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Showcase');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Vitrine');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Vetrina');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Schränke'), 0);

-- Einfuegen: Kommode (Moebelstueck in Kategorie Aufbewahrung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Kommode');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Chest of drawers');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Commode');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Cassettone');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Aufbewahrung'), 0);

-- Einfuegen: Nachttisch (Moebelstueck in Kategorie Aufbewahrung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Nachttisch');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Bedside table');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Table de chevet');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Comodino');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Aufbewahrung'), 0);

-- Einfuegen: Kleiderschrank (Moebelstueck in Kategorie Kleideraufbewahrung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Kleiderschrank');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Wardrobe');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Garde-robe');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Guardaroba');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Kleideraufbewahrung'), 0);

-- Einfuegen: Aufhängesystem (Moebelstueck in Kategorie Kleideraufbewahrung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Aufhängesystem');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Suspension');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Suspension');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Sospensione');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Kleideraufbewahrung'), 0);

-- Einfuegen: Schuhgestell (Moebelstueck in Kategorie Kleideraufbewahrung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Schuhgestell');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Shoe rack');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Range-chaussures');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Scarpiera');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Kleideraufbewahrung'), 0);

-- Einfuegen: Sonstige (Moebelstueck in Kategorie Aufbewahrung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sonstige');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Other');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Autre');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Altro');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Aufbewahrung'), 0);

-- Einfuegen: Schreibtischlampe (Moebelstueck in Kategorie Beleuchtung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Schreibtischlampe');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Desk lamp');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Lampe de bureau');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Lampada da scrivania');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Beleuchtung'), 0);

-- Einfuegen: Standleuchte (Moebelstueck in Kategorie Beleuchtung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Standleuchte');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Floor lamp');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Lampadaire');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Lampada da terra');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Beleuchtung'), 0);

-- Einfuegen: Hängeleuchte (Moebelstueck in Kategorie Beleuchtung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Hängeleuchte');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Hanging lamp');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Suspension');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Lampada a sospensione');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Beleuchtung'), 0);

-- Einfuegen: Nachttischlampe (Moebelstueck in Kategorie Beleuchtung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Nachttischlampe');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Bedside lamp');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Lampe de chevet');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Lampada da comodino');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Beleuchtung'), 0);

-- Einfuegen: Sonstige (Moebelstueck in Kategorie Beleuchtung)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sonstige');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Other');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Autre');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Altro');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Beleuchtung'), 0);

-- Einfuegen: Komplettes Bett (Moebelstueck in Kategorie Betten)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Komplettes Bett');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Complete bed');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Lit complet');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Letto completo');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Betten'), 0);

-- Einfuegen: Bettgestell ohne Matratze (Moebelstueck in Kategorie Betten)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Bettgestell ohne Matratze');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Bed frame without mattress');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Cadre de lit sans matelas');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Struttura letto senza materasso');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Betten'), 0);

-- Einfuegen: Lattenrost (Moebelstueck in Kategorie Betten)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Lattenrost');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Slatted');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Lattes');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'A stecche');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Betten'), 0);

-- Einfuegen: Aufblasbares Bett (Moebelstueck in Kategorie Betten)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Aufblasbares Bett');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Inflatable Bed');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Lit gonflable');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Gommone letto');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Betten'), 0);

-- Einfuegen: Matratze (Moebelstueck in Kategorie Betten)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Matratze');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Mattress');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Matelas');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Materasso');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Betten'), 0);

-- Einfuegen: Sonstige (Moebelstueck in Kategorie Betten)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sonstige');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Other');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Autre');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Altro');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Betten'), 0);

-- Einfuegen: Sitzbank (Moebelstueck in Kategorie Sitzen)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sitzbank');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Bench');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Banc');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Panchina');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Sitzen'), 0);

-- Einfuegen: Bettsofa (Moebelstueck in Kategorie Sofas)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Bettsofa');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Sofa bed');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Canapé-lit');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Divano letto');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Sofas'), 0);

-- Einfuegen: Sessel (Moebelstueck in Kategorie Sitzen)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sessel');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Chair');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Chaise');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Sedia');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Sitzen'), 0);

-- Einfuegen: Bürostuhl (Moebelstueck in Kategorie Stühle)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Bürostuhl');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Office Chair');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Chaise de bureau');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Sedia da ufficio');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Stühle'), 0);

-- Einfuegen: Esszimmerstuhl (Moebelstueck in Kategorie Stühle)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Esszimmerstuhl');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Dining room chair');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Chaise de salle à manger');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Sedia sala da pranzo');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Stühle'), 0);

-- Einfuegen: Gartenstuhl (Moebelstueck in Kategorie Stühle)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Gartenstuhl');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Garden chair');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Chaise de jardin');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Sedia da giardino');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Stühle'), 0);

-- Einfuegen: Sonstige (Moebelstueck in Kategorie Sitzen)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sonstige');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Other');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Autre');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Altro');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Sitzen'), 0);

-- Einfuegen: Esstisch (Moebelstueck in Kategorie Tische)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Esstisch');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Dining table');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Table à manger');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Tavolo da pranzo');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Tische'), 0);

-- Einfuegen: Couchtisch (Moebelstueck in Kategorie Tische)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Couchtisch');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Coffee table');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Table basse');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Tavolino da caffè');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Tische'), 0);

-- Einfuegen: Schreibtisch (Moebelstueck in Kategorie Tische)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Schreibtisch');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Desk');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Bureau');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Scrivania');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Tische'), 0);

-- Einfuegen: Wohnzimmertisch (Moebelstueck in Kategorie Tische)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Wohnzimmertisch');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Living room table');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Table de salon');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Living room table');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Tische'), 0);

-- Einfuegen: Gartentisch (Moebelstueck in Kategorie Tische)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Gartentisch');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Garden table');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Table de jardin');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Tavolo da giardino');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Tische'), 0);

-- Einfuegen: Sonstige (Moebelstueck in Kategorie Tische)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sonstige');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Other');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Autre');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Altro');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Tische'), 0);

-- Einfuegen: Sonnenschirm (Moebelstueck in Kategorie Garten)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Sonnenschirm');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Parasol');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Parasol');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Parasole');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Garten'), 0);

-- Einfuegen: Gartenzelt (Moebelstueck in Kategorie Garten)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Gartenzelt');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Garden tent');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Tente de jardin');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Tenda da giardino');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Garten'), 0);

-- Einfuegen: Grill (Moebelstueck in Kategorie Garten)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Grill');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Grill');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Gril');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Griglia');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and map.text = 'Garten'), 0);

-- Einfuegen: Badezimmer (Moebelstueck in Kategorie Sonstige)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Badezimmer');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Bathroom');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Salle de bain');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Bagno');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and cat.parent is null and map.text = 'Sonstige'), 0);

-- Einfuegen: Schlafzimmer (Moebelstueck in Kategorie Sonstige)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Schlafzimmer');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Bedroom');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Chambre à coucher');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Camera da letto');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and cat.parent is null and map.text = 'Sonstige'), 0);

-- Einfuegen: Wohnzimmer (Moebelstueck in Kategorie Sonstige)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Wohnzimmer');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Living room');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Salon');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Soggiorno');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and cat.parent is null and map.text = 'Sonstige'), 0);

-- Einfuegen: Flur (Moebelstueck in Kategorie Sonstige)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Flur');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Corridor');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Couloir');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Corridoio');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and cat.parent is null and map.text = 'Sonstige'), 0);

-- Einfuegen: Aussen (Moebelstueck in Kategorie Sonstige)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Aussen');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Outside');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'à l''extérieur');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Al di fuori');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and cat.parent is null and map.text = 'Sonstige'), 0);

-- Einfuegen: Spiegel (Moebelstueck in Kategorie Sonstige)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Spiegel');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Mirror');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Miroir');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Specchio');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and cat.parent is null and map.text = 'Sonstige'), 0);

-- Einfuegen: Teppich (Moebelstueck in Kategorie Sonstige)
insert into multilingual_string (string_id) values (nextval('hibernate_sequence'));
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Deutsch', 'de', 'Teppich');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'English', 'en', 'Carpet');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Français', 'fr', 'Tapis');
insert into multilingual_string_map (string_id, locale, locale_code, text) values ((select max(string_id) from multilingual_string), 'Italiano', 'it', 'Tappeto');
insert into piece_of_furniture (id, name_string_id, furniture_category, value) values (nextval('hibernate_sequence'), (select max(string_id) from multilingual_string), (select cat.id from furniture_category cat, multilingual_string strng, multilingual_string_map map where cat.name_string_id = strng.string_id and map.string_id = cat.name_string_id and map.locale_code = 'de' and cat.parent is null and map.text = 'Sonstige'), 0);
