# java101


## Java Tarihçesi

Javanin yillara gore gelisim evrelerini goruntuleyebilecegimiz bir link ekleyecegim.

## Java Nedir


## Java Dilinin Basarisi Nedir ?

 -  Bellek problemlerini cozmesidir.

 - Nesneye yonelik progamalamaya uygun olmasi programlarimizi yazarken daha uygun gelistirmeler yapmamizi sagliyor.

 - Cok uzun yillardan beri sagladigi "bir kez yaz her yerde calistir" olanagini saglamasidir.

## Cop Toplayici Nedir?


- Programlarimizin calisma suresi boyunca ortaya cikan ve sonradan kullanilmayan gereksiz nesneleri bulur ve onlari temizler.  

- Mekanizmanin adi cop toplayici ( garbage collector ) olarak bilinir. 

- C++ gibi dillerde bellekte yer kaplayan bilgilerin temizlenmesi sorumlulugu, java dilinde kodlama yapan kisiye ait degildir.

- Cunku gereksiz ve kullanilmayan bellek alanlarini cop toplayici (garbage collector) mekanizmasi ile temizlemesidir.


## JDK JRE JVM Kavramları

## Değişkenler

En temel bilgi depolacagimiz birime DEGISKEN denir. Degiskenler RAM uzerinde saklanir. Program uzerinde tanimlandiklari yere gore etki 
alanlarina sahiptirler. Etki alanlarini kaybettiklerinde RAM uzerinden silinirler. 


	int age = 20;
					- int  veri tipi
					- age  degisken adi
					- 20   degiskene atanan sayi degeri

Her degiskenin tip ve etki alani ozelligi vardir.

Degisken Tipleri;

	- Nesne degiskenleri
	- Statik degiskenler
	- Yerel degiskenler
	- Parametre degiskenleri


### Nesne Degiskenleri

Bir sinif icerisinde tanimlanir ve sinifin tum nesneleri, ornekleri icin farkli degerler icerebilir.


Peki Sinif nedir? 

	Soyut veya somut kavramlari karsilayacagimiz programlarimizin ana bilesenleridir.



Ornek 

	  Elimizde bir kitabimiz olsun. 
	  Kitabin var olmasini saglayan parcalara bakalim;
	   
	   - yazar
	   - adi
	   - tur
	   - renk
	   - sayfa sayisi 
	   - basilan matbaa



Bu kitabi programimiza tanimlamak icin

	- kitap isminde bir sinif olustururuz
	- parcalarini tanimlamak icin nesne degiskenleri olustururuz. 



### Statik degiskenler

Nesne degiskenleri, onune static anahtar kelimesi alarak, ayni siniftan olusturulan tum nesneleri, ornekleri, kopyalari icin ayni degeri almasi saglanir.


Ornek

	- Elimizdeki kitap sinifindan 5 tane kitap olusturduk ve gerekli bilgileri doldurduk.  
	
	- Eger yazar bilgisi static olarak tanimlanmis ise yazarin bilgisi tanimlandiginda tum kitaplarin yazari ayni olacaktir. 

	- Cunku static olarak tanimlandiginda tum kitap nesneleri bellekte ayni yerden okuyacaktir.


### Yerel degiskenler

Siniflarin icindeki metotlarin iclerinde tanimlanir.

Peki Metot nedir ?

	Bir isme sahip, yapilmasini istedigimiz bir veya birkac islemin blok halinde cagrilabilir halidir.
	Metodu cagirarak o islemlerin yapilmasini saglariz.

Yerel degiskenler o tanimlanan blogun disina cikildiginda etkilerini kaybederler ve ulasilamazlar.


### Parametre degiskenleri

Siniflarin icindeki metotlarin iclerinde kullanilmak uzere gecici olarak aldigi degerlerdir.


https://github.com/keramiozsoy/java101/tree/main/java101/src/main/java/examples/VariableExample.java


https://www.geeksforgeeks.org/what-is-the-difference-between-field-variable-attribute-and-property-in-java/


## Veri Tipleri


Yazdigimiz programlarin kullanmasini istedigimiz bilgileri, veri tipleri ile siniflandirabiliyoruz.

Harf, kelime, cumle veya bircok farkli sayi gosterim seklini farkli veri tipler araciligi ile programimiza tanititabiliyoruz.

Java tip-guvenli (type-safe) bir dildir. Bu durum, degisken tanimlamak istedigimizde mutlaka veri tipinin ne oldugunu tanimlamak zorunda 
oldugumuzu ifade eder.


### Ilkel Veri Tipleri




#### Tamsayilar


	- byte
	- short
	- int 
	- long 



#### Ondalik Sayilar


	- float
	- double


#### Karakterler


	- char


#### Mantiksal Tipler





### Referans Veri Tipleri





## Operatörler

## Kontrol İfadeleri

## Fonksiyonlar

## Diziler