-- tieccuoi.menu definition
CREATE TABLE `menu` (
                        `id` bigint NOT NULL AUTO_INCREMENT,
                        `gia` float DEFAULT NULL,
                        `mo_ta` varchar(255) DEFAULT NULL,
                        `ten_menu` varchar(255) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;