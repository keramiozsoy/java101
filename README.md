# java101

https://github.com/keramiozsoy/java101/find/main

# BIRINCI BOLUM


## Java Nedir ?


Java hem bir dil hem de bir ortam olarak dusunebilirsiniz.

Dilin kullanildigi yerlere birkac ornek verelim.

 - Web uygulamalari
 
 - Masaustu uygulamalari

 - Oyunlar 
 
 - Android gibi temel gucu buyuk oranda java tarafindan gelen mobil uygulamalar gelisitirebilirsiniz.



## Java Tarihçesi

	1995 yilinda James Gosling tarafindan tasarlanarak
	baslanan bu java projesi zamanla farkli tarihsel surecler gecirdi.



	Java dilini dunyaya tanitan ve daha hizli yayilmasini 
	saglayan Sun Microsystems isimli firmadir.



	Uzun yillardan sonra Oracle firmasi bu firmayi satin aldigi 
	icin Java diline ait tum haklar el degistirmis oldu.



	JDK Beta				1995
	JDK1.0					1996   
	JDK 1.1					1997


	(

	Java Database Connectivity - JDBC 
		
	Java dili kullarak veritabanlarina erismek ve
	islemler yapmak istedigimizde bize yardimci olan kutuphane gibi dusunebiliriz.


	JDBC Yazdigimiz kod ile vertabana ozel yazilmis kutuphaneler
	arasindaki bir noktayi temsil eder. Farkli varitabanlarina
	baglanmak icin ek olarak farkli kutuphanelere ihtiyacimiz var.

	Veritabani kutuphanelerini Java yi gelistirenler gelistirmiyorlar.


	JAVA PROGRAMI 
	------>  JDBC 
	------>------>------>  JDBC DRIVER MySQL 
	------>------>------>  JDBC DRIVER SQL Server
	------>------>------>  JDBC DRIVER Oracle
	------>------>------>  JDBC DRIVER PosgtreSQL 
	------>------>------>  JDBC DRIVER SQLite
	------>------>------>  JDBC DRIVER Microsoft Access 
	------>------>------>  JDBC DRIVER Mongo
		
	)





	J2SE 1.2				1998


	(

		Java Swing

		- Java dili kullanarak masaustu uygulamalar yazilmasinin onu acilmis oldu.

		Java Server Pages

		- HTML icinde Java kodlari calistirilabilir hale geldiginden
		internet siteleri JSP kullanarak kodlanmaya baslandi.

		- ASP ve PHP ye cok benzer fakat java kullanilan halidir.

	)





	J2SE 1.3				2000

	(
		XML teknolojisi ile java artik iletisim kurabilecek duruma gelmis bulunuyor.
	)




	J2SE 1.4				2002
	J2SE 5.0				2004

	(
		Enum, For each gibi yapilar java ya eklendi.
	)



	Java SE 6				2006
	Java SE 7				2011 

	( 
		Switch icerisinde String kullanma ozelligi geldi.
	)

	Java SE 8 (LTS)		Mart 2014
	Java SE 9			Eylul 2017
	Java SE 10			Mart 2018
	Java SE 11 (LTS)	Eylul 2018
	Java SE 12			Mart 2019
	Java SE 13			Eylul 2019
	Java SE 14			Mart  2020
	Java SE 15			Eylul 2020
	Java SE 16			Mart 2021
	Java SE 17 (LTS)	Eylul 2021
	Java SE 18			Mart 2022




## Java Dilinin Basarisi Nedir ?


 - Bellek problemlerini cozmesidir.

 - Nesneye yonelik progamalamaya uygun olmasi programlarimizi yazarken daha uygun gelistirmeler yapmamizi sagliyor.

 - Cok uzun yillardan beri sagladigi "bir kez yaz her yerde calistir" olanagini saglamasidir.


## Cop Toplayici Nedir?


- Programlarimizin calisma suresi boyunca ortaya cikan ve sonradan kullanilmayan gereksiz nesneleri bulur ve onlari temizler.  

- Mekanizmanin adi cop toplayici ( garbage collector ) olarak bilinir. 

- C++ gibi dillerde bellekte yer kaplayan bilgilerin temizlenmesi sorumlulugu
kodlama yapana ait iken , java dilinde kodlama yapan kisiye ait degildir.

- Cunku gereksiz ve kullanilmayan bellek alanlarini cop toplayici (garbage collector) temizlemektedir.

- Cop toplayici temizleme islemleri yaparken kullanilan java versiyonlara gore yillar icinde degiserek farkli yontemler ile isini halleder.
	* referans sayma yontemi
	* kopyalama yontemi
	* isaretle ve supur yontemi
	* artan(sira) yontemi
	* vb.



## Java Nasil Calisir?

Bit kavramini ogrendikten sonra nasil calistirigina bakabiliriz.

 Bit nedir?


  0 veya 1 ile bilginin bellekte olmasi veya olmamasi durumunu karsiyalan terimdir.

 

 Bayt (Byte) ise 8 haneli bit ten olusan terimdir.


Derleme Islemi ( Compile Time )

	Kaynak Kod       Javac Komutu              Bayt	Kod
	==================================================================
	Hello.java       javac Hello.java          Hello.class


Calistirma Islemi ( Run Time )


	Java Komutu
	==================================================================
	java Hello      Yorumlayici ( interpreter ) hersey yolunda gitti ise mutlu son :)




## JDK JRE JVM Kavramları

	JVM - Java Sanal Makinasi ( Java Virtual Machine)

		- JVM isletim sistemi ile java kodumuz arasinda kopru gorevindedir. 

		- Bu nedenle yazilan kod herhangi bir degisiklik yapilmadan bir kere yazip her yerde calistirabiliriz.

	JRE - Java Calistirma Ortami ( Java Runtime Environment )

    	- Java uygulamalarinin calismasi icin gereken kutuphanleri barindirir.

	JDK - Java Gelistirebilme Ortami ( Java Development Environment )

    	- Yazilimcilarin programlama yapabilmesi ve calistirabilmesine
    	 olanak saglar (JRE icindedir.)

    	JDK = JRE + JVM


Farkli JVM versiyonlari var

- HotSpot JVM Oracle
- Eclipse OpenJ9
- GraalVM
- vb.

Farkli JDK versiyonlari var. 
  
- Oracle JDK
- Open JDK
	- -> Amazon Correto 
	- -> SapMachine (SAP JDK)
	- -> Azul
	- -> Red Hat OpenJDK
	- -> IBM OpenJDK
- vb.

Proje baslangicida bir jdk/jvm secilerek kodlamaya baslanir.
Neden farkli versiyonlar oldugunu arastirabilirsiniz ?




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



Bu kitaba ait kalibimiz olsa, kolayca kitap uretebiliriz. 

Peki program yaziyoruz programimiza tanimlamak icin ne yapariz?

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




## Depolanan veriler nerede tutulur ?


- Static alan ( RAM )
		
		Static degisken ya da metotlar RAM uzerindeki heap alaninda tutulurlar.
		
		Java 8 den once PermGen(Permenant Generation), 
		sonra ise Metaspace isimli kalici bolgede konumlanirlar.

		Peki farklari nedir?
		PermGen sinifli bir boyutu var, Metaspace otomatik olarak boyutu artabilir.

- Stack  ( RAM )
- Heap   ( RAM )
- Kaydedilen dosyalar ( Hard Disk )


## Stack Kavramı

Javada kullanılan primitif ve yerel değişkenler ile objelerin referanslarının tutulduğu hafıza bölgesine stack diyoruz. Bununla birlikte, java memory management için Stack yığın yapısının Last In First Out ( LIFO - Son giren ilk çıkar ) türünü  kullanmaktadır. 

![Resim 1](https://github.com/keramiozsoy/java101/blob/main/images/1stack.png)


Sırası ile adımları inceleyip anlamaya çalışalım. 

1
- Görüldüğü üzere main metodumuz ve main metodumuz içerisinde
 calculate isimli başka bir metod çağırma işlemi yapılmaktadır.



2
- Java’da bir method çağırımı yapıldığında, ilgili değişkenler Stack’e sırası ile eklenmeye başlar. 
Bunun için öncelikle memory de boş bir stack yaratılır. 



3
- args = empty args main metoduna gönderilen parametre için stack üzerinde bir array tutar.



4
- int value = 7 satırı için value = 7 olarak bir değer tutar.



5
- value = calculate(value) methodu ile artık calculate metod çağırımı yapılır, 
bunun için calculate metodu içerisinde kullanılacak veri için stack’e bir değer daha eklenir.

	Burada dikkat edilmesi gereken iki husus vardır. 

	- --> value değişkeninin değeri pass by value şeklinde aktarılır. 
	Yani ilgili değişkenin değerinin bir kopyası methoda argümen olarak gönderilir.

	- --> calculate methoduna geçildiği anda artık main metod out-ouf-scope durumuan gelir. 
	Bu aşamadan sonra main metodu içerisindeki value değerlerine erişim yapılamaz. 


6
- int = tempValue satırında tempValue için stack’e bir değer daha eklenir.


7
- int = newValue satırında newValue için stack’e bir değer daha eklenir. 

8 
- return olduğu andan itibaren stack üstünde bulunan veri, 
tempValue ve newValue alanları stackten silinir ve artık main method scopuna geri dönülmüş olur.

9
- artık value değişkeninin değeri 20 olacaktır.

10
- Kodumuzda bu aşamadan sonra işletilecek bir kod satırı kalmadığı için JVM tarafından ilgili stack boşaltılır.

11
- Eğer stack üzerinde herhangi bir değer kalmadığında, JVM tarafından ilgili stack hafızadan silinir. 




		Java’da bütün lokal değişkenler stacklerde tutulur,
		method çağırımı sonra erdiğinde jvm tüm değerleri sileceği için stack boş kalacaktır, böylelikle bu değişkenler hafızada yer kaplamaz. 

		

		Ek bilgi : Java’da her bir thread ın kendisine ait bir yığını bulunur. Bu da sizin oluşturduğunuz her thread in hafızada yer kaplayacağı anlamına gelir. ( Thread kavramı ve memory management nasıl olur bir araştırma konusu olsun lütfen. )




## Heap Kavramı

Stack kavramından bahsederken, stack üzerinde local değişkenlerin tutulduğundan bahsetmiştik. 

- Heap dediğimiz şey ise aslinda Java tarafından nesnelerin tutulduğu yerdir. 

Java’da new anahtarı ile oluşturulan tüm nesneler memory de Heap denilen  
ve JVM tarafından yönetilen yerde saklanır.

Yani javadaki tüm Objeler Heap üstünde tutulur. 

Aslinda bu bölgeler öyle gözle görünüp fark edeceğimiz şeyler değildir. 

- Siz bir java uygulamasını çalıştırdığınızda, 

JVM sizin için memory de bellek tahsis(allocation) yapar ve
bu yapılan tahsis içerisinde de bu bölümleri ayırır. 

(Bir java uygulaması için minimum bellek ihtiyacı ne kadardır? Çok fazla bellek ihtiyacımız varsa bunu nasıl yapabiliriz? ) 




Aşağıdaki örnekte, iki farklı değişken hafızada nasıl tutulduğunu görebiliyoruz. 


![Resim 2](https://github.com/keramiozsoy/java101/blob/main/images/2stack-vs-heap.png)



Şimdi objelerin heap üstünde nasıl tutulduğuna daha iyi anlamak için aşağıda kodu inceleyelim.

![Resim 3](https://github.com/keramiozsoy/java101/blob/main/images/3string-list-on-heap.png)


Yukarıda main metod içerisinde bir String Listesi oluşturuluyor. 

Oluşturulan String listesine 3 eleman ekleniyor ve eklenen elemanlar, 

printList metoduna gönderilerek her eleman yazdırılıyor. 

Şimdi bu program parçasının hafızada JVM tarafından nasıl tutulduğuna bakalım.


![Resim 4](https://github.com/keramiozsoy/java101/blob/main/images/4string-list-on-heap-detail.png)


1
- List<String> myList = new ArrayList<>() satırı ile Heap bölgesinde bir list objesi tutuluyor.


2
- myList.add(“One”) komutu ile yine Heap bölgesinde String verisi taşıyan ve
 değeri One olan bir obje daha tutuluyor. 
 ( not, burada new String(“One”) olarak düşünelim, daha anlaşılır olur.


3
- Diger eleman ekleme işlemleri için de aynı adımlar uygulanıyor ve
 artık List objesi üzerinde tutulan String objelerinin
  heap bölgesinde referansları tutuluyor.






Örneğimize printList methodunu değiştirerek farklı bir açıdan bakalım. 

![Resim 5](https://github.com/keramiozsoy/java101/blob/main/images/5printlist-method-change.png)



1
- String value = data.get(1) dediğimizde, listenin birinci elemanındaki değeri yeni bir değişkene atıyoruz. value isimli bir değişkenin stack üzerinde String objesinin referansını tuttuğunu görüyoruz. Dikkat ederseniz, burada aynı objeye iki farklı referans veriyoruz. Liste içerisinde bulunan List objesi içerisinde birinci String içerisindeki eleman ile Stack üzerinde bulunan value değişkeninin referansı aynı yere bakıyor. İşte bu da Java’da Pass by Reference olarak nitelendiriliyor. 



2
- Stack üzerinde bulunan myList objesi artık out-of-scope durumundadır ve biz bu değişkene erişim yapamıyoruz, erişebildiğimiz değişkenler data ve value değişkenleridir. 


3
- data.add(“Four”) ile liste objesine artık yeni bir string değer daha ekliyoruz. 


4
-Listenin tüm elemanları yazdırıyoruz ve sonrasında value ve data değişkenleri stack üzerinden siliniyor çünkü metodumuz bitti. 





## Veri Tipleri


Yazdigimiz programlarin kullanmasini istedigimiz bilgileri, veri tipleri ile siniflandirabiliyoruz.

Harf, kelime, cumle veya bircok farkli sayi gosterim seklini farkli veri tipler araciligi ile programimiza tanititabiliyoruz.

	- Java tip-guvenli (type-safe) bir dildir. Bu durum, degisken tanimlamak istedigimizde mutlaka veri tipinin ne oldugunu tanimlamak zorunda 
	oldugumuzu ifade eder.


### Ilkel Veri Tipleri



	Primitive Tip	Uzunluk	Minimum Değer	Maksimum Değer	Varsayılan Değer 	Sinif-Nesne Tipi

	char			16 Bit	Unicode 0		Unicode 2^16-1	‘\u0000’			Character

	long			64 Bit	-2^63			2^63-1			 0L					Long

	int				32 Bit	-2^31			231-1			 0 					Integer

	short			16 Bit	-2^15			215-1			 0 					Short

	byte			8 Bit	-2^7			2^7-1			 0 					Byte

	double			64 Bit	-3.4*10^38		3.4*10^38		 0.0d 				Double

	float			32 Bit	– 1.7*1038		1.7*1038		 0.0f				Float	

	boolean			1 Bit									 false				Boolean




#### Tamsayilar


	- byte

		byte b = 65;


	- short

		short s = 65;


	- int 

		int i = 65;


	- long 

		long l = 65L;



#### Ondalik Sayilar


	- float

		float f = 65f;

		float f = 65F;


	- double

		double d = 65.55d;

		double d = 65.55D;


Peki bu calisir mi ? 

		double example = 127.00F;


<details>
<summary> Sorunun Cevabi Icin Tikla</summary>
<p>
	
```bash
		Evet. Aslinda burada double olusturulur.
```

</p>
</details>



#### Karakterler


	- char

		char c = 'A';
		
		char c = 65; // Buyuk A harfinin ascii tablosundaki karsiligidir.



Peki bu calisir mi?

		char c = "A"; 

<details>
<summary> Sorunun Cevabi Icin Tikla</summary>
<p>
	
```bash
		// Boyle tanimalama yapamazsiniz. Bu farkli birsey demektir. (String)
```

</p>
</details>






#### Mantiksal Tipler

	- boolean

	 boolean b = true;




##### Ilkel Veri Tipleri arasinda tip donusum islemleri

Ornek 

	int tipindeki bir degeri short tipine cevirebiliriz. Fakat veri kaybi olur.
	int tipindeki bir degeri long tipine cevirebiliriz. Veri kaybi olmaz.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/VariableTypeConvertion.java


### Referans Veri Tipleri


Yukaridaki Ilkel veri tiplerinin gelistirilmis sinif mantigina dayanan halleri vardir.
Ayni degerleri siniflar yardimi ile olusturabiliyoruz.

- Character
- Long
- Integer
- Short
- Byte
- Double
- Float	
- Boolean

Peki ama neden bu siniflara ihtiyacimiz var ?

Bu soruların cevabını verebilmek için int ve Integer arasındaki farkı anlatarak cevaplamaya çalışayım. 


	int primitiveNumber = 5;

	Integer objectNumber = new Integer(5);


Yukaridaki tanimlamalarin farklina bakalim.


	-	int bir primitive veri tipidir Integer ise bir nesnedir

	-	Integer bir nesne değişkeni olduğu için null değeri alabilir fakat int veri tipi null değeri alamaz. Herhangi bir değer ataması yapılmadığında ilgili veri tipinin default değerini alır. Integer nesne değişkenine herhangi bir değer ataması yapılmadığında null değeri alır.

	-	Integer tipinde bir değişken java.lang.Integer sınıfında ki metotları kullanabilir, int veri tipi ise kullanamaz.

	-	Integer tipinde ki değişkenleri bir vektör ya da koleksiyon içerisinde tutabiliriz fakat int veri tipi ile bunu yapamayız.

	-	Primitif veri tipleri (byte, short, int, double, float, double, char, boolean) bir nesne olmadığı için serialize(serileştirme) işlemine tutamayız. ( 
	Serileştirme nedir, nerelerde kullanılır, ne zaman kullanılır gibi soruları lütfen araştırınız. )

	-	Integer gibi sınıflar immutable (değişmez) özelliğe sahiptirler, sıradan nesneler gibi davranmazlar.

Bununla birlikte ek bir not olarak;  Java derleyicisi gerektiğinde tanımlanan her ilkel veriyi ait olduğu sınıfa otomatik olarak gömer buna kutulama (boxing) denilir ya da derleyici gerektiğinde bir sınıf nesnesini ilkel veri tipine döndürür buna da kutu açma (unboxing) denilir. Her iki işlemi de Java derleyicisi kendiliğinden otomatik yapar.



##### Referans Veri Tipleri ayni objeyi gostermesi

Ornek 
	Iki adet obje tanimlayip ayni referansa baglayalim.
	Ayrıca bir referans değişkeninde saklanan bir nesnenin 
	referansını başka bir referans değişkenine atayabilirsiniz. 
	Bu gibi durumlarda, her iki referans değişkeni de bellekteki aynı nesneye atıfta bulunacaktır.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/VariableAssignSameObject.java


VisualVM aracini heap alanindaki bilgilere bakmak icin inceleyebilirsiniz.

https://www.youtube.com/watch?v=Bu-P0aZyOfE



# IKINCI BOLUM YARIN DEVAM EDELIM


## Operatörler

	- Operatörler ilsem ozelligi olan simgelerdir. 

	- En basit toplama + cikarma - carpma * bolme / birer operatordur.

Java’da operatörleri yaptıkları işe göre sınıflandırabiliriz.

	-	Atama Operatörleri

	-	Aritmetik Operatörler

	-	Karşılaştırma Operatörler

	-	Mantıksal Operatörler

	-	Bit Tabanlı Operatörler




### Atama Operatorleri 


	=	Sağdaki değeri soldaki değere atar.
	+=	Soldaki sağdakine ekler, sonucu soldakine atar.
	-=	Soldakini sağdakinden çıkarır, sonucu soldakine atar.
	*=	Soldakini sağdaki ile çarpar, sonucu soldakine atar.
	/=	Soldakini sağdakine böler, sonucu soldakine atar.
	%=	Soldaki ile sağdakinin modunu alır, sonucu soldakine atar.


Ornek

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ValueAssignToVariable.java


Ornek

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/AssingmentOperators.java



### Aritmetik Operatörler

	+	Toplama İşlemi
	-	Çıkarma İşlemi
	*	Çarpma İşlemi
	/	Bölme İşlemi
	%	Mod alma  ( iki sayiyi birbirine bol kalani cevap olarak don)
	--	Bir eksiltme
	++	Bir arttırma

Ornek

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ArithmeticOperators.java



###	Karşılaştırma Operatörler


	==	Eşittir
	<	Küçüktür
	>	Büyüktür
	<=	Küçük Eşittir
	>=	Büyük Eşittir
	!=	Eşit Değildir


Ornek

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/CompareOperators.java



###	Mantıksal Operatörler

Degiskenleri karsilastirip, sonuc olarak boolean tipinde veri donmesini istedigimiz durumlarda operatorler kullaniriz.


	AND	&&	Sağındaki ve solundaki ifadelerin ikisi de doğru ise “true” sonuç döndürür diğer durumlarda “false” döner

	OR	||	Sağındaki ya da solundaki herhangi birisi doğru ise “true” sonuç döner diğer durumlarda “false” döner.

	XOR	^	Sağ yada soldaki her iki ifade de aynı ise yani ( true –  true) yada (false – false) gibi . sonuç “false” olarak döner diğer durumlarda “true” döner.

	NOT	!=	Kendisinden sonra gelen ifadenin değerinin tersini alır.


Ornek

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LogicalOperators.java


###	Bit Tabanlı Operatörler


	AND			&	
					İki sayının ikilik tabanda birbirine karşılık düşen her bitini "ve"  işlemine sokarak bir sonuç elde eder.

					Ve islemi nedir ? 
					Basamaklar karsilastirilirken 
					her ikisi 1 ise 1 diger durumlarda 0 olarak islemin sonucu her basamak icin ayri ayri yazilir.

	
	OR			|	
					İki sayının ikilik tabanda birbirine karşılık düşen her bitini "veya"  işlemine sokarak  bir sonuç elde eder.

					Veya islemi nedir ?
					Basamaklar karsilastirilirken 
					en az biri 1 ise 1 diger durumlarda 0 islemin sonucu her basamak icin ayri ayri yazilir.

	
	XOR			^	İki sayının ikilik tabanda birbirine karşılık düşen her bitini "özel veya" işlemine sokarak bir sonuç elde eder.
					Ozel veya nedir ?
					Basamaklar karsilastirilirken
					birbirinden farkli ise 1  diger durumlarda 0 islemin sonucu her basamak icin ayri ayri yazilir.


	
	Right Shift	>>	Bir sayının ikilik tabandaki karşılığını bir basamak sağa kaydırır. İkilik tabanda 2 ile "bölme" olarak da adlandırılabilir.
					Isaret biti  nedir ?
					Sayi negatif ise 1, pozitif ise 0 dir.

					Bu islem nasil yapilir?
					Sayiyi binary olarak yaz. Sayının bitlerini sağa kaydırır ve kalan soldaki boşlukları işaret biti ile doldurur. 


	
	Left Shift	<<	Bir sayının ikilik tabandaki karşılığını bir basamak sağa kaydırır. İkilik tabanda 2 ile "çarpma" olarak da adlandırılabilir
					Isaret biti  nedir ?
					Sayi negatif ise 1, pozitif ise 0 dir.

					Bu islem nasil yapilir?
					Sayiyi binary olarak yaz. Sayının bitlerini sola kaydırır ve kalan sagdaki boşlukları işaret biti ile doldurur. 



	Unsigned Right Shift	>>> Ayrintiya girmeyelim.

	Unsigned Left Shift		<<< Ayrintiya girmeyelim.

	
	Ters		~	Bir sayının ikilik tabandaki karşılığındaki her bitini "tersler". Yani 1 olan bitleri 0, 0 olan bitleri 1 yapar.

	
	Ternary 	?	3 argüman alan tek operatördür ve bir değişkene şartlı atama yapılmasını sağlar. 

					a == b ? "esit" : "degil"



Bu konu cok karsilasacaginiz bir konu degil.


# UCUNCU BOLUM YARIN DEVAM EDELIM




## Kontrol Ifadeleri

- karsilastirma
	- if else
	- switch case

- dongu 
	- while
	- do while
	- for
	- for each 

- dallanma
	- break
	- continue
	- label:
	- return


### if else


Kosullara gore programlarimin akisini yonlendirebilecegimiz yapilardir.


Ornek 
	
	Sinav sonucuna gore alinan harf notunu gosteren bir program yazabiliriz.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/DecisionMakingIfElse.java



Ornek 
	
	18 yasindan kucukler ehliyet alamaz, 18 yasindan buyukseniz ehliyet alabilirsiniz. 
	Ayni zamanda eger paraniz yetiyorsa araba alabilirsiniz yetmiyorsa alamazsiniz kosullarini saglayan uygulamayi yazalim.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/DecisionMakingIfElseIncludeIfElse.java


### switch case


Tamsayilarin karsilastirilip dogru kosullarin else edilmesini saglayan mekanizmadir. 

Java 7 ile birlikte switch icerisinde secimi belirleyn ifade artik tamsayi olmak zorunda degildir!!!




Desteklenen tipler asagidadir.

Ilkel tipler

	- byte
	- short
	- char
	- int

sarmalayici siniflar

	- Byte
	- Short
	- Character
	- Integer

sarmalayici siniflar

	- String

isimler ile numaralandirma yaptigimiz 

	- enum


Ornek

	Yukaridaki tipler ile ilgili ornek yapalim.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/DecisionMakingSwitchCasePrimitiveAndWrapperTypes.java



	Switch case 

	If else yapisi ile neredeyse islem mantigi aynidir. 

	Fakat break ve default anahtar kelimeleri ile islem akisini yonlendirmek kabiliyetinden dolayi ekstra ayricaligi vardir.



Ornek

	Girilen sayiya gore aylari getiren uygulamayi yazalim

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/DecisionMakingSwitchCaseBreak.java

	
Ornek 

	Onceki uygulamada bulunan break komutlarini silerek uygulamayi tekrar calistirdigimizda herhangi bir fark olur mu ?


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/DecisionMakingSwitchCaseWithoutBreak.java



Soru


	break kullanmamak sizce her zaman problem midir ?



Ornek 
	
	Break kullanmayacagim ve bu durum ile bir problemi cozecegim.



	Bir zincir market dusunelim. 

	Kendisinin satin aldigi urunler ile ilgili tum operasyonu yonetmek istiyor.

	Bunun icin bize kendi istekleri dogrultusunda calisanlara goreveler veriyor.

	- Farkli kisilerin farkli islemleri yapabilmesi isteniyor.

	- Yil olarak eski calisanlarin yeni calisanlara gore daha cok etki alanina sahip olmasi isteniyor.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/DecisionMakingSwitchCaseWithoutBreakShop.java


Odev

	Bu ornegi ic ice if else yazarak hangi kullanim seklinin size gore daha temiz oldugunu karsilastirabilirsiz.



Ornek 
	
	Switch case, break ve default kullanilan senaryoya bakalim.

	- Bir okul yonetimi verilecek dersleri onceden acikliyor. 

	- Ogrencilerin sectigi derslere gore ogrenciler dersleri alacak. 
	
	- Fakat secmedikleri durumda onlari spor dalina yonlendirecek programi yazalim.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/DecisionMakingSwitchCaseBreakDefaultSchool.java






# DORDUNCU BOLUM YARIN DEVAM EDELIM

## Donguler

- Donguler tekrarli islemleri yapmamizi sagliyor.

- Donguleri olusturan 3 baslik mevcuttur.

		Kac kez donecegini belirtecegimiz degisken olusturulur ve ilk deger atanir.

		Dongunun sonlandirilmasi veya devam etmesi icin bir kosul cumlesi belirtilir.

		Ilk maddedeki tanimlanan degiskenin ne kadar artip azalacagi belirlenir. 



### while dongusu


-  While dongusu, kosulu sagladigi surece bitmeyen donguler olusturmayi saglar.

Ornek 
	
	5 e kadar olan sayilari yazdiran while dongusunu yazalim.

	
https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopWhile.java


Ornek

	1 ile 5 arasindaki rasgele secilen bir sayinin bulunmasi istenilen  programi yazmak icin while kullanabiliriz.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopWhileRandomNumber.java




### do while dongusu


- Do while dongusu, en 1 kez bekledigiim bir islem calissin ve ardindan kosuluma gore programim calismaya devam etsin.

Ornek

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopDoWhile.java



Ornek 
	
	do while Sonsuz dongu 

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopInfinitive.java





### for dongusu


onceki dongulere benzeyen fakat tum kosul ve durumlari tek bir satirda gosterebilecegimiz bir yapidir.


Ornek 

	Sayilari ikiser ikiser arttirarak yazan programi kodlayalim.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopFor.java



Ornek 

	Carpim tablosunu ekrarn yazdiran donguyu yazalim. Ic ice iki dongu kullanalim.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopForInFor.java



Ornek 

	10 dan geriye dogru sayilari yazdiran donguyu yazalim.


LoopForDecrement




Ornek 

	for dongusunde sonsuz dongu olusturalim.



https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopForInfinitive.java



### for each 




### Continue anahtar kelimesi kullanimi


Ornek

- 5000 e kadar olan tum 5 e bolunebilen sayilari ekrana yazdiran programi yazalim.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopBranchingContinue.java





bir liste icerisinde var olan ayni degerleri tek for dongusu kullarak bulmaya calisalim.



# BESINCI BOLUM YARIN DEVAM EDELIM













	









SORULAR

- Disaridan 3 parametre alan ve ekrana yazan uygulamayi yaziniz. (args)

- MaviTelefon ve KirmiziTelefon olacak sekilde iki sinif olusturunuz. MaviTelefon sinifinda
static olmayan bir metot tanimlayin. Metot ile " mavi telefondan mesaj var " seklinde bir mesaj tanimlayip geri dondurelim.
KirmiziTelefon icerisinden yazdigimiz onceki metodu cagiralim.

- 1 den 100 e kadar ielrkeyen dongu icerisinde her 100 adimda ekrana dongunun kacinci adiminda oldugunu yazan bir uygulama yazalim

- 5 dan 50 ye kadar olan sayilari ekrana yazarken sadece 5 ve 5in katlarini ekrana yazmayan uygulama yaziniz.



## Fonksiyonlar

## Diziler