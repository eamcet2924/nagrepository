DROP TABLE mytable_arjun;
CREATE TABLE `mytable_arjun` (                   
  `id` int(10) NOT NULL AUTO_INCREMENT,                   
  `customer_pledge_id` bigint(20) unsigned NOT NULL,      
  `vendor_id` int(10) NOT NULL,                           
  `vendor_pledge_amount` decimal(10,2) DEFAULT '0.00',    
  `account_number` varchar(250) DEFAULT NULL,             
  PRIMARY KEY (`id`)                                      
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;