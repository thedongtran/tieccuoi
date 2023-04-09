-- tieccuoi.mon_an definition

CREATE TABLE `mon_an` (
                          `id` int NOT NULL AUTO_INCREMENT,
                          `don_vi_tinh` varchar(255) DEFAULT NULL,
                          `gia` float DEFAULT NULL,
                          `hinh_anh` varchar(255) DEFAULT NULL,
                          `mo_ta` varchar(255) DEFAULT NULL,
                          `ten_mon_an` varchar(255) DEFAULT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;