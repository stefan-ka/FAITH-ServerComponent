-- ------ insert FACILITIES -------
-- Einfuegen: Dummy Owner für alle Einrichtungen
delete from user_account where email='all@facilities.owner';
insert into user_account (id, email, password) values (nextval('hibernate_sequence'), 'all@facilities.owner', md5('1234'));
	
-- Einfuegen: Behindertenheime
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Münchenstein', 'Schweiz', 'leitung.wg.m-stein@bluewin.ch', null, null, null, 1, 'Wohngruppen für Behinderte Kinder', '061 411 46 11', 'Zollweidenstrasse 13', '4142', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Behindertenheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Chur', 'Schweiz', 'sekretariat.thf@kjpd.gr.ch', null, null, 'http://www.kjpd-gr.ch/deutsch/therapiehaus/index.php', 1, 'Therapiehaus Fürstenwald', '081 353 10 64', 'Waisenhausstrasse 1', '7000', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Behindertenheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Schaan', 'Liechtenstein', 'admin@hpz.li  ', null, null, 'http://www.hpz.li/', 1, 'Heilpädagogisches Zentrum des Fürstentums Liechtenstein', '+423 237 61 61', 'Bildgass 1', '9494', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Behindertenheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Baar', 'Schweiz', 'zuwebe@zuwebe.ch', null, null, 'www.zuwebe.ch', 1, 'ZUWEBE', '041 781 68 68', 'Untere Rainstrasse 31', '6341', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Behindertenheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Solothurn', 'Schweiz', 'info@schulheim-so.ch', null, null, 'www.schulheim-so.ch', 1, 'Stiftung Schulheim für körperbehinderte Kinder', '032/625 82 50', 'Schöngrünstr. 46', '4500', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Behindertenheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Münchenbuchsee', 'Schweiz', 'info@maetteli.ch', null, null, 'www.maetteli.ch', 1, 'Stiftung Sonderschulheim Mätteli', '031/ 868 92 11', 'Schöneggweg 60', '3053', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Behindertenheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Romanshorn', 'Schweiz', 'info@hpz-romanshorn.ch', null, null, 'www.hpz-romanshorn.ch', 1, 'Heilpädagogisches Zentrum Romanshorn', '071 463 27 35', 'Schulstrasse 16', '8590', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Behindertenheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));

-- Einfuegen: Jugendheime
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Mendrisio', 'Schweiz', 'luisa.piatti@comfamiliare.org', null, null, 'www.pictor.comfamiliare.ore', 2, 'Foyer Casa di Pictor', '091/646 59 31', 'Via Turconi 20', '6850', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Jugendheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Lugano', 'Schweiz', 'foyer.vignola@amilcare.ch', null, null, 'www.amilcare.ch', 2, 'Foyer Vignola', '091/971 88 48', 'Via alla Campagna 8', '6900', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Jugendheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Winterthur', 'Schweiz', 'info@dsw.ch', null, null, 'www.dsw.ch', 2, 'DSW Durchgangsstation Winterthur', '052 213 22 22', 'Tösstalstrasse 48', '8400', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Jugendheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Schlieren', 'Schweiz', 'info@jwgl.ch', null, null, 'www.jwgl.ch', 2, 'Jugendwohngruppe Limattal', '044 773 27 80', 'Turmstrasse 14', '8952', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Jugendheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Seon', 'Schweiz', 'aufnahmeheim@bluewin.ch', null, null, 'www.aufnahmeheim.ch', 2, 'Aufnahmeheim Seon', '062 797 75 88', 'Seetalstrasse 4', '5703', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Jugendheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));

-- Einfuegen: Kinderheime
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Brugg', 'Schweiz', 'info@kinderheimbrugg.ch', null, null, 'www.kinderheimbrugg.ch', 2, 'Kinderheim Brugg', '056 448 90 20', 'Wildenrainweg 8', '5201', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Kinderheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Au-Wädenswil', 'Schweiz', 'info@gruenau.org', null, null, 'www.gruenau.org', 2, 'Kinderheim Grünau', '044 781 38 59', 'Toblerweg 3', '8804', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Kinderheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'St. Gallen', 'Schweiz', 'tempelacker@swissonline.ch', null, null, 'www.tempelacker.ch', 2, 'Säuglings- und Kinderheim Tempelacker', '071 244 55 75', 'Tempelackerstrasse 28', '9001', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Kinderheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Münsingen', 'Schweiz', 'sonnhalde@swi.salvationarmy.org', null, null, 'www.heilsarmee.ch/sonnhalde', 2, 'Kinderheim Sonnhalde', '031/ 721 08 06', 'Standweg 7', '3110', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Kinderheim'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));

-- Einfuegen: Obdachlosenhäuser
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Zürich', 'Schweiz', null, null, null, null, 3, 'Katholisches Obdachlosenheim', '044 271 63 39', 'Konradstrasse 79', '8005', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Obdachlosenhaus'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Basel', 'Schweiz', 'info@wallstrasse16.ch', null, null, 'www.stiftungsucht.ch', 3, 'Tageshaus für Obdachlose', '061 272 92 77', 'Wallstrasse 16', '4010', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Obdachlosenhaus'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Basel', 'Schweiz', 'ines.toggenburger@bs.ch', null, null, null, 3, 'Notschlafstelle Basel', '061 681 18 19', 'Alemannengasse 1', '4058', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Obdachlosenhaus'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));

-- Einfuegen: Therapie und Rehabilitation
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Neuenkirch', 'Schweiz', 'ufwind@bluewin.ch', null, null, 'www.ufwind.ch', 1, 'Wohnheim Ufwind', '041 469 60 69', 'Sparrenhüsli', '6206', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Therapie und Rehabilitation'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Herisau', 'Schweiz', 'info@saentisblick.org', null, null, 'http://www.saentisblick.org', 1, 'Verein Säntisblick-Sozialpsychiatrische Angebote', '071 353 73 00', 'Sonnenfeldstr. 9', '9100', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Therapie und Rehabilitation'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Gampel', 'Schweiz', 'info@viagampel.ch', null, null, 'www.viagampel.ch', 1, 'Via Gampel', '027 933 13 33', 'Fabrikstrasse 6', '3945', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Therapie und Rehabilitation'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Winterthur', 'Schweiz', 'info@qhs.ch', null, null, 'www.qhs.ch', 1, 'Quellenhof-Stiftung', '052 245 13 13', 'Barbara-Reinhart-Strasse 20', '8404', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Therapie und Rehabilitation'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Muraz/Sierre', 'Schweiz', 'info@villaflorasierre.ch', null, null, null, 1, 'Centre d''accueil Villa Flora', '027/455 75 51', 'Chemin des Cyprès 4', '3960', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Therapie und Rehabilitation'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Thônex', 'Schweiz', 'crmt@argos.ch', null, null, 'www.argos.ch', 1, 'ARGOS - CRMT (HO)', '022 869 18 80', 'Chemin Du Bois-des-Arts 38', '1226', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Therapie und Rehabilitation'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));

-- Einfuegen: Waisenhäuser
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Felsberg', 'Schweiz', 'spp.fornerod@gotthilft.ch', null, null, 'www.spp-verbund.ch', 3, 'Sozialpädagogische Pflegefamilie Fornerod', '081 252 35 21', 'Untere Gasse 56', '7012', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Waisenhaus'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Berneck', 'Schweiz', 'tigelberg.berneck@bluewin.ch', null, null, null, 3, 'Tigelberg Berneck', '071 744 75 70', 'Tigelbergstr. 3', '9442', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Waisenhaus'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
insert into facility (id, city, country, email, gps_latitude, gps_longitude, homepage, level, name, phone, street, zip, facility_category, user_account) 
 values (nextval('hibernate_sequence'), 'Basel', 'Schweiz', 'info@whbs.ch', null, null, 'www.waisenhaus-basel.ch', 3, 'Bürgerliches Waisenhaus', '061 699 33 11', 'Theodorskirchplatz 7', '4058', (select fcat.id from facility_category fcat, multilingual_string mstr, multilingual_string_map msmap where fcat.name_string_id = mstr.string_id and msmap.string_id = fcat.name_string_id and msmap.locale_code = 'de' and msmap.text = 'Waisenhaus'), (select uact.id from user_account uact where uact.email = 'all@facilities.owner'));
