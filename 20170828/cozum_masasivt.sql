/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50714
 Source Host           : localhost:3306
 Source Schema         : cozum_masasivt

 Target Server Type    : MySQL
 Target Server Version : 50714
 File Encoding         : 65001

 Date: 28/08/2017 08:42:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for problems
-- ----------------------------
DROP TABLE IF EXISTS `problems`;
CREATE TABLE `problems`  (
  `ProbID` int(11) NOT NULL AUTO_INCREMENT,
  `problem` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci,
  `date` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`ProbID`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 71 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_turkish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of problems
-- ----------------------------
INSERT INTO `problems` VALUES (4, 'İşlemlerden, sanal pos iadesi işaretlenip devam edildiğinde iade işlemi başarılı olamadı yazıyor mesajın gitmesi için “evet” tıklanıyor “sanal pos iadesi xxxxxxxxxx (bu alanda numara yazıyor) başarıyla kaydedildi” mesajı çıkıyor tamamlanmamış bir işlem sonrası gelen mesajın durdurulması ricasıyla Örnek: 5728716-5738116-134585314', '2017-08-18 11:02:56');
INSERT INTO `problems` VALUES (3, '1564841324/02/09 poliçe hesap özetine göre poliçe 3.846,00.-TL borçlu durumda ancak taksitler alanı hatalı görünmekte bu nedenle tahsilat yapılamamaktadır. Taksitler alanın düzeltilmesi konusunda yardımlarınızı rica ederiz. Saygılarımla', '2017-08-17 14:02:33');
INSERT INTO `problems` VALUES (2, '1245789854/00 Poliçenin hesap özeti ile taksitleri alanı birbiri ile uyumlu değildir. uyumlu hale getirilmesi ve poliçenin bakiye üzerinden iptali konusunda yardımlarınızı rica ederim Saygılarımla', '2017-08-17 10:02:00');
INSERT INTO `problems` VALUES (1, 'Merhabalar Ekte ekran görüntüsünü gönderdiğim poliçede yürürlükte olmayan hatta aktif bile olmayan 9540 ile başlayan karttan çekim denemeleri yapılmakta.Biz gerekli kontrolleri ASOS yardım hattı vasıtasıyla da kontrol ettik.Hatalı yada eksik bir şey gözükmüyor.Ama çekim denemeleri mütemadiyen devam ediyor.Başarısız her çekim denemesi de sigortalıya SMS olarak gidiyor.Hülasa olayda bir gariplik var.Bu durumun düzeltilmesi konusunda ACİL yardımınızı rica ederim.', '2017-08-02 15:01:18');
INSERT INTO `problems` VALUES (5, '9845678120 nolu poliçe kontağında bulunan 3 adet sanal pos tahsilatı iptal edilmiştir. Kontaktan poliçeye yapılan tahsilat eşleştirmesi de otomatik olarak iptal olması gerekirken ödemenin hala poliçeden kaldırılmadığı , hesaplar arası aktarım işleminin iptalinin yansımadığı tespit edilmiştir. Manuel olarak hesaplar arası aktarım işlemini iptal edildiğinde ise kontaktaki tahsilatlardan ikisi eşleşmemiş tutar olarak kalmıştır. Ekran görüntüleri ektedir. Konuyla ilgili acil yardımlarınız rica olunur.', '2017-08-19 16:03:41');
INSERT INTO `problems` VALUES (6, '9348204839/05/03 Poliçenin hesap özeti ile taksitleri alanı birbiri ile uyumlu değildir. uyumlu hale getirilmesi ve poliçenin bakiye üzerinden iptali konusunda yardımlarınızı rica ederim Saygılarımla.', '2017-08-19 16:24:49');
INSERT INTO `problems` VALUES (7, 'Taksitler alanı hatalı görünmekte bu nedenle tahsilat yapılamamaktadır. 8453029373/01/09 poliçe hesap özetine göre poliçe 1.566,00.-TL borçlu durumda ancak hatadan dolayı tahsilat yapılamamaktadır. Taksitler alanın düzeltilmesi konusunda yardımlarınızı rica ederiz. Saygılarımla,', '2017-08-21 15:27:19');
INSERT INTO `problems` VALUES (8, '9829374823 nolu aracın Tramer veri kaydında kayıdı bulunduğu halde arama yapıldığında ulaşılamamakta ve araç internet üzerinden sigortalanamamaktadır. Tramer sisteminin veri tabanı sorgusu hatası konusunda yardımınızı rica ederiz.', '2017-08-21 15:58:47');
INSERT INTO `problems` VALUES (9, 'Java kodlarını derlemek için gerekli olan Eclipse programını kurdum. Ama çalışmıyor. Yardım ederseniz sevinirim.', '2017-08-25 15:37:09');
INSERT INTO `problems` VALUES (10, 'Anadolu Sigorta İntranet sayfasında, Yardımlaşma Derneği yönlendirilmesindeki Ağustos listesi yerine yeni ayın listesi getirilecektir. Gerekli HTML kodları butona yönlendirilmiştir fakat sayfada işlem görülememiş, yeni liste yerine eski liste tekrardan ekrana geldiğinden bir sonuç alınamamıştır.', '2017-08-25 15:50:07');

-- ----------------------------
-- Table structure for remarks
-- ----------------------------
DROP TABLE IF EXISTS `remarks`;
CREATE TABLE `remarks`  (
  `RemarkID` int(11) NOT NULL AUTO_INCREMENT,
  `remark` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci,
  `ProbID` int(11) NOT NULL,
  PRIMARY KEY (`RemarkID`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_turkish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of remarks
-- ----------------------------
INSERT INTO `remarks` VALUES (1, 'Bu durum için taksit ödemeleri devam ederken müşterinin bir kartı kapatılmış olup başka bir aktif karta taşıma yapmamız gerekti. Yukarıdaki sorgulardan fikir yürütülebilir.', 1);
INSERT INTO `remarks` VALUES (2, 'Poliçe detaylı bir şekilde incelendikten sonra revive edildi. Muhasebe dengesini sağlamak amacıyla taksit tutarları düzenlendi. Poliçe revive edildikten sonra hesap özeti dengesi sağlandı ve BT tarafından iptal edildi. Şu an hesabın bakiyeleri sıfır durumdadır ve taksitler alanı ile hesap hareketleri alanı uyumlu hale getirilmiştir.', 2);
INSERT INTO `remarks` VALUES (3, 'Kontak hesabın 152365434 numaralı taksiti hazır durumdadır. Son durumda 2 adet 882 liralık eşleşmemiş tutar ortaya çıkmıştır. Dolayısı ile kontak hesapta 882TL güncel hesap bakiyesi ve -1764TL güncel vade bakiyesi olmalıdır. Güncellemeyi bu şekilde gerçekleştirdik.', 5);
INSERT INTO `remarks` VALUES (4, '549875  tahsilatın hesaplar arası aktarımı sebebi ile son durumda para kontak hesapta bulunuyor. Poliçe hesabında hazır durumdaki 1252346 numaralı 882TL tutarlı taksit ve hesapta para olmaması sebebi ile bu hesabın da güncel vade ve güncel hesap bakiyelerini 882TL olarak güncelledik.\n ', 5);
INSERT INTO `remarks` VALUES (5, 'İndirme Bağlantısı: http://www.oracle.com/technetwork/java/javase/downloads/index.html', 9);

-- ----------------------------
-- Table structure for solutions
-- ----------------------------
DROP TABLE IF EXISTS `solutions`;
CREATE TABLE `solutions`  (
  `SolutionID` int(11) NOT NULL AUTO_INCREMENT,
  `solution` text CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci,
  `ProbID` int(11) NOT NULL,
  PRIMARY KEY (`SolutionID`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 38 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_turkish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of solutions
-- ----------------------------
INSERT INTO `solutions` VALUES (1, '0416433014/04\n25.05->31.05 arasında tahsilat denemiş. 9540********1234 10 2020 red:yetersiz bakiye\n\n\n<kbd> \nselect * from cn_contact where external_contact_number = \'123456\';\nselect * from cn_contact_bank_account where contact_id = 841621;\nselect * from ac_installment where contact_bank_account_id in (85432185);\n</kbd>', 1);
INSERT INTO `solutions` VALUES (2, '<kbd>Insert into ac_account_bln (\nID,\nACCOUNT_ID,\nPREV_ACCOUNT_BALANCE_ID,\nCOMBINED_ACC_BALANCE_ID)\nvalues\n((select (min(id) -1) from ac_account_bln), /*ID*/\n\'49331058\', /*ACCOUNT_ID*/\n\'3833193\', /*PREV_ACCOUNT_BALANCE_ID*/\n\'3833194\'); /*COMBINED_ACC_BALANCE_ID*/\n \nupdate ac_account_ bln set balance = 0 where id = 3833193 /*PRE-ID*/;</kbd>', 2);
INSERT INTO `solutions` VALUES (3, 'Hesap hareketlerini incelediğimiz zaman iletildiği gibi 3846 liralık bir farkın olduğunu görmekteyiz. Bu farkı kapatmak için 3846 TL tutarlı 412314 ID’li taksiti iptalden hazır durumuna çektik. Böylece 3846 liralık bir borç bakiyesi oluşturmuş olduk. Bu güncelleme sonrası güncel hesap bakiyesi ödenmemiş durumdaki tek taksit olan 3846 TL olmalı; güncel vade bakiyesi de aynı şekilde 3846 TL olmalıdır.', 3);
INSERT INTO `solutions` VALUES (4, 'Js ile ready\'de -id varsa manipüle ettik\n  \n <kbd>\n\n \nfunctionready(f){/in/.test(document.readyState)?setTimeout(\'ready(\'+f+\')\',9):f()}\n \nready(function(){\ndebugger;\nvarfailure=\'<idit2:labelresourceCode=\"4002724\"/>\';\nvarmessagePaneANDL=document.getElementsByClassName(\"successMessagePane\");\n \nif(messagePaneANDL!=null){\nif(messagePaneANDL.length>0){\nvarm=messagePaneANDL[0].innerHTML;\nvarregex=/SanalPos.ades.\\-\\d+/gi;\nif(regex.exec(m)){\nmessagePaneANDL[0].innerHTML=m.replace(/Ba.ar.ylaKaydedildi/,failure);\n}\n}\n}\n}); </kbd>', 4);
INSERT INTO `solutions` VALUES (5, '549875  numaralı sanal pos tahsilatının 846522 ve 654841 işlem numarası ile iki adet iadesi gözükmektedir. Ancak bu durumu incelediğimizde sanal pos iade işleminin banka tarafında iptal edilmesinden dolayı aslında  bu iki iade işleminin toplamda bir hesap hareketi yaratmadığını tespit ettik. Dolayısı ile bu işlemlerin tutarlarını sıfırladık.', 5);
INSERT INTO `solutions` VALUES (6, '549872  numaralı sanal pos tahsilatının iadesi 337234 ile başarılı bir şekilde gerçekleşmiş. Bu kayıtlar için herhangi bir müdahalede bulunmadık.', 5);
INSERT INTO `solutions` VALUES (28, '33533 numaralı tahsilat için\n·        1234124  > Sanal POS tahsilatı\n·        1251223 > Hesaplar arası aktarım işlemi\n·        1241266 > Hesaplar arası aktarım işlemi iptali\nBurada da yanlış yapılan bir işlem söz konusu. Tahsilatın otomatik olarak iade edilmesi için hesaplar arası aktarım işlemi iptali değil, sanal pos iptali yapılmalıydı. Ancak son işlem iptali ile birlikte para kontak hesaba dönmüş ve eşleşmemiş tutar olarak gözüküyor. Bu bir hata değildir.', 5);
INSERT INTO `solutions` VALUES (29, 'Java SDK dosyalarını indirip, kurulumu yeniden yapınız.', 9);
INSERT INTO `solutions` VALUES (30, 'Butona gerekli yönlendirilme yapılmış, liste güncellenmiştir', 10);

-- ----------------------------
-- Table structure for tagproblems
-- ----------------------------
DROP TABLE IF EXISTS `tagproblems`;
CREATE TABLE `tagproblems`  (
  `TagProbID` int(11) NOT NULL AUTO_INCREMENT,
  `TagID` int(255) NOT NULL,
  `ProbID` int(255) NOT NULL,
  PRIMARY KEY (`TagProbID`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 23 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_turkish_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of tagproblems
-- ----------------------------
INSERT INTO `tagproblems` VALUES (17, 4, 6);
INSERT INTO `tagproblems` VALUES (16, 1, 6);
INSERT INTO `tagproblems` VALUES (15, 1, 5);
INSERT INTO `tagproblems` VALUES (13, 8, 9);
INSERT INTO `tagproblems` VALUES (12, 9, 9);
INSERT INTO `tagproblems` VALUES (11, 10, 9);
INSERT INTO `tagproblems` VALUES (10, 7, 3);
INSERT INTO `tagproblems` VALUES (9, 4, 3);
INSERT INTO `tagproblems` VALUES (8, 1, 3);
INSERT INTO `tagproblems` VALUES (7, 1, 2);
INSERT INTO `tagproblems` VALUES (6, 4, 2);
INSERT INTO `tagproblems` VALUES (5, 5, 2);
INSERT INTO `tagproblems` VALUES (4, 6, 2);
INSERT INTO `tagproblems` VALUES (3, 1, 1);
INSERT INTO `tagproblems` VALUES (2, 2, 1);
INSERT INTO `tagproblems` VALUES (1, 3, 1);
INSERT INTO `tagproblems` VALUES (18, 6, 6);
INSERT INTO `tagproblems` VALUES (19, 11, 5);
INSERT INTO `tagproblems` VALUES (20, 11, 7);
INSERT INTO `tagproblems` VALUES (21, 7, 7);
INSERT INTO `tagproblems` VALUES (22, 12, 10);

-- ----------------------------
-- Table structure for tags
-- ----------------------------
DROP TABLE IF EXISTS `tags`;
CREATE TABLE `tags`  (
  `TagID` int(11) NOT NULL AUTO_INCREMENT,
  `tag` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`TagID`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_turkish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tags
-- ----------------------------
INSERT INTO `tags` VALUES (12, 'HTML');
INSERT INTO `tags` VALUES (11, 'tahsilat');
INSERT INTO `tags` VALUES (10, 'SDK');
INSERT INTO `tags` VALUES (9, 'Eclipse');
INSERT INTO `tags` VALUES (8, 'Java');
INSERT INTO `tags` VALUES (7, 'borç');
INSERT INTO `tags` VALUES (6, 'bakiye');
INSERT INTO `tags` VALUES (5, 'muhasebe');
INSERT INTO `tags` VALUES (4, 'taksit');
INSERT INTO `tags` VALUES (3, 'acil');
INSERT INTO `tags` VALUES (2, 'asos');
INSERT INTO `tags` VALUES (1, 'poliçe');

SET FOREIGN_KEY_CHECKS = 1;
