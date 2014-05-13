-- change zip column on facility table from integer to character varying(255)
alter table facility rename zip to zip_old;
alter table facility add column zip character varying(255);
update facility set zip = zip_old;
alter table facility drop column zip_old;
