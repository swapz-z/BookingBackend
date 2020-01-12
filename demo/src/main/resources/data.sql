Insert into CATEGORY(C_ID, CATEGORY_NAME, CATEGORY_DESC)
values (1, 'Hotel', 'Hotel des');
Insert into CATEGORY(C_ID, CATEGORY_NAME, CATEGORY_DESC)
values (2, 'Hotels', 'Hotela des');
Insert into CATEGORY(C_ID, CATEGORY_NAME, CATEGORY_DESC)
values (3, 'Restaurants', 'Restaurants des');
Insert into CATEGORY(C_ID, CATEGORY_NAME, CATEGORY_DESC)
values (4, 'Motels', 'Motels des');

INSERT INTO HOTEL_GPS(GID,LATITUDE,LONGITUDE)
values (1,45.421611,12.376187);
INSERT INTO HOTEL_GPS(GID,LATITUDE,LONGITUDE)
values (2,40.68973,-95.788826);
INSERT INTO HOTEL_GPS(GID,LATITUDE,LONGITUDE)
values (3,46.933598,-110.735886);

Insert into HOTEL_INFO(HOTEL_ID, ADDRESS, CITY, COUNTRY, HOTEL_NAME, PINCODE, PROVINCE,GPS_ID)
values (0, 'Riviera San Nicol 11/a', 'Mableton', 'US', 'Hotel Russo Palace', 30126, 'GA',1);

Insert into HOTEL_INFO(HOTEL_ID, ADDRESS, CITY, COUNTRY, HOTEL_NAME, PINCODE, PROVINCE,GPS_ID)
values (57, '2113 Sapp Brothers Dr', 'Percival', 'US', 'Americas Best Value Inn', 51648, 'IA',2);

Insert into HOTEL_INFO(HOTEL_ID, ADDRESS, CITY, COUNTRY, HOTEL_NAME, PINCODE, PROVINCE,GPS_ID)
values (97, '316 N Main St', 'Neihart', 'US', 'Little Belt Inn Neihart', 59465, 'MT',3);

INSERT INTO HOTEL_CATEGORY(hotelloca_id, category_id)
values (0, 1);
INSERT INTO HOTEL_CATEGORY(hotelloca_id, category_id)
values (0, 2);
INSERT INTO HOTEL_CATEGORY(hotelloca_id, category_id)
values (57, 1);
INSERT INTO HOTEL_CATEGORY(hotelloca_id, category_id)
values (57, 4);
INSERT INTO HOTEL_CATEGORY(hotelloca_id, category_id)
values (97, 1);
INSERT INTO HOTEL_CATEGORY(hotelloca_id, category_id)
values (97, 4);
INSERT INTO HOTEL_CATEGORY(hotelloca_id, category_id)
values (57, 3);

--/*select  c.category_name, h.hotel_name from category c ,hotel_info h,hotel_category hc
--where hc.hotelloca_id=h.hotel_id
--and hc.category_id = c.c_id;
--*/

