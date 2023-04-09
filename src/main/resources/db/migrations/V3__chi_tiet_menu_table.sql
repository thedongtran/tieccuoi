-- tieccuoi.chi_tiet_menu definition

CREATE TABLE `chi_tiet_menu` (
                                 `id` int NOT NULL AUTO_INCREMENT,
                                 `gia` float DEFAULT NULL,
                                 `so_luong` float DEFAULT NULL,
                                 `id_menu` bigint DEFAULT NULL,
                                 `id_mon_an` int DEFAULT NULL,
                                 PRIMARY KEY (`id`),
                                 KEY `FKta1lyvl9eqc5xf5ukgoyr9fqm` (`id_menu`),
                                 KEY `FKa4v954cv9kkva1e0ec3x2x6mh` (`id_mon_an`),
                                 CONSTRAINT FOREIGN KEY (`id_mon_an`) REFERENCES `mon_an` (`id`),
                                 CONSTRAINT  FOREIGN KEY (`id_menu`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;