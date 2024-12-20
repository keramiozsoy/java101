<!-- MarkdownTOC  autolink=true -->

- [java101](#java101)
- [BIRINCI BOLUM](#birinci-bolum)
	- [Java Nedir ?](#java-nedir-)
	- [Java Tarihçesi](#java-tarih%C3%A7esi)
	- [Java Dilinin Basarisi Nedir ?](#java-dilinin-basarisi-nedir-)
	- [Cop Toplayici Nedir?](#cop-toplayici-nedir)
	- [Java Nasil Calisir?](#java-nasil-calisir)
	- [JDK JRE JVM Kavramları](#jdk-jre-jvm-kavramlar%C4%B1)
	- [Değişkenler](#de%C4%9Fi%C5%9Fkenler)
		- [Nesne Degiskenleri](#nesne-degiskenleri)
		- [Statik degiskenler](#statik-degiskenler)
		- [Yerel degiskenler](#yerel-degiskenler)
		- [Parametre degiskenleri](#parametre-degiskenleri)
	- [Depolanan veriler nerede tutulur ?](#depolanan-veriler-nerede-tutulur-)
	- [Stack Kavramı](#stack-kavram%C4%B1)
	- [Heap Kavramı](#heap-kavram%C4%B1)
	- [Veri Tipleri](#veri-tipleri)
		- [Ilkel Veri Tipleri](#ilkel-veri-tipleri)
			- [Tamsayilar](#tamsayilar)
			- [Ondalik Sayilar](#ondalik-sayilar)
			- [Karakterler](#karakterler)
			- [Mantiksal Tipler](#mantiksal-tipler)
				- [Ilkel Veri Tipleri arasinda tip donusum islemleri](#ilkel-veri-tipleri-arasinda-tip-donusum-islemleri)
		- [Referans Veri Tipleri](#referans-veri-tipleri)
				- [Referans Veri Tipleri ayni objeyi gostermesi](#referans-veri-tipleri-ayni-objeyi-gostermesi)
- [IKINCI BOLUM YARIN DEVAM EDELIM](#ikinci-bolum-yarin-devam-edelim)
	- [Operatörler](#operat%C3%B6rler)
		- [Atama Operatorleri](#atama-operatorleri)
		- [Aritmetik Operatörler](#aritmetik-operat%C3%B6rler)
		- [Karşılaştırma Operatörler](#kar%C5%9F%C4%B1la%C5%9Ft%C4%B1rma-operat%C3%B6rler)
		- [Mantıksal Operatörler](#mant%C4%B1ksal-operat%C3%B6rler)
		- [Bit Tabanlı Operatörler](#bit-tabanl%C4%B1-operat%C3%B6rler)
- [UCUNCU BOLUM YARIN DEVAM EDELIM](#ucuncu-bolum-yarin-devam-edelim)
	- [Kontrol Ifadeleri](#kontrol-ifadeleri)
		- [if else](#if-else)
		- [switch case](#switch-case)
- [DORDUNCU BOLUM YARIN DEVAM EDELIM](#dorduncu-bolum-yarin-devam-edelim)
	- [Donguler](#donguler)
		- [while dongusu](#while-dongusu)
		- [do while dongusu](#do-while-dongusu)
		- [for dongusu](#for-dongusu)
		- [for each](#for-each)
		- [Continue anahtar kelimesi kullanimi](#continue-anahtar-kelimesi-kullanimi)
- [BESINCI BOLUM YARIN DEVAM EDELIM](#besinci-bolum-yarin-devam-edelim)
	- [String Operations](#string-operations)
		- [String Karsilastirma](#string-karsilastirma)
		- [String Length](#string-length)
		- [String Upper Case & Lower Case](#string-upper-case--lower-case)
		- [String indexOf](#string-indexof)
		- [String charAt](#string-charat)
		- [String Concatenation](#string-concatenation)
		- [String Trim](#string-trim)
		- [String SubString](#string-substring)
		- [String Manupilation](#string-manupilation)
	- [Math Operations](#math-operations)
		- [IEEE-754 Virgullu Sayi Gosterimi](#ieee-754-virgullu-sayi-gosterimi)
		- [Bir kac farkli durum icin java derleyicisinin nasil ciktilar verdigine bakalim.](#bir-kac-farkli-durum-icin-java-derleyicisinin-nasil-ciktilar-verdigine-bakalim)
		- [Math.abs](#mathabs)
		- [Math.ceil](#mathceil)
		- [Math.floor](#mathfloor)
		- [Math.floorDiv](#mathfloordiv)
		- [Math.round](#mathround)
		- [Math.min](#mathmin)
		- [Math.max](#mathmax)
		- [Math.pow](#mathpow)
		- [Math.sqrt](#mathsqrt)
	- [Wrapper Classes Cache Mechanism](#wrapper-classes-cache-mechanism)
		- [Integer Sinif](#integer-sinif)
	- [Case Study](#case-study)
	- [Fonksiyonlar](#fonksiyonlar)
	- [Diziler](#diziler)
	- [Kalitim ve Komposizyon](#kalitim-ve-komposizyon)
		- [KALITIM](#kalitim)
		- [KOMPOZISYON](#kompozisyon)
		- [POLIMORFIZM](#polimorfizm)
	- [Eşzamanlılık \( Concurrency \) ve Paralellik \( Parallelism \)](#e%C5%9Fzamanl%C4%B1l%C4%B1k--concurrency--ve-paralellik--parallelism-)
		- [Merkezi Islem Birimi ve Cekirdek nedir, Is parcalari ile iliskisi nedir](#merkezi-islem-birimi-ve-cekirdek-nedir-is-parcalari-ile-iliskisi-nedir)
		- [Neden Multithreading yapilara ihtiyac vardir](#-neden-multithreading-yapilara-ihtiyac-vardir)
		- [Multithreding Maaliyetleri](#multithreding-maaliyetleri)
		- [Multitasking nedir?](#multitasking-nedir)
			- [Concurrency](#concurrency)
			- [Parallel Execution\( Paralel Calismak \) ve Parallelism \( Paralellik,Dagitik\)](#parallel-execution-paralel-calismak--ve-parallelism--paralellikdagitik)
		- [Genel ozet](#genel-ozet)
		- [Soru cevaplar ile devam edelim.](#soru-cevaplar-ile-devam-edelim)
		- [Thread nasil olusturulur ? Thread sinifi veya Runnable arayuzu nasil kullanilir ?](#thread-nasil-olusturulur--thread-sinifi-veya-runnable-arayuzu-nasil-kullanilir-)
		- [Lambda function kullanarak Thread olusturalim](#lambda-function-kullanarak-thread-olusturalim)
		- [ExecutorService kullanarak Thread olusturma](#executorservice-kullanarak-thread-olusturma)
		- [Thread Pool Size neye gore ayarlanir](#thread-pool-size-neye-gore-ayarlanir)
		- [Thread yasam dongusunun ogrenelim](#thread-yasam-dongusunun-ogrenelim)
			- [Durumlarin kod orneklerine bakalim](#durumlarin-kod-orneklerine-bakalim)
			- [Is parcalarinin birbirilerine sinyal gonderme islemleri](#is-parcalarinin-birbirilerine-sinyal-gonderme-islemleri)
	- [Synchronized Anahtar kelimesi](#synchronized-anahtar-kelimesi)
		- [Sinifin Nesnesine Ait Metot](#sinifin-nesnesine-ait-metot)
		- [Sinifin Nesnesine Ait Metot Icinde istenilen bir bolge](#sinifin-nesnesine-ait-metot-icinde-istenilen-bir-bolge)
		- [Static Metot](#static-metot)
		- [Static Metot Icinde istenilen bir bolge](#static-metot-icinde-istenilen-bir-bolge)
	- [ReentrantLock ile lock mekanizmalari](#reentrantlock-ile-lock-mekanizmalari)
	- [Deadlock](#deadlock)
	- [Deadlock tan nasil kacinilir.](#deadlock-tan-nasil-kacinilir)
- [ALTINCI BOLUM YARIN DEVAM EDELIM](#altinci-bolum-yarin-devam-edelim)
	- [Farkli is parcalari ayni kod parcasina ayni anda erisirlerse ne olur ? \( Race Conditions \)](#farkli-is-parcalari-ayni-kod-parcasina-ayni-anda-erisirlerse-ne-olur---race-conditions-)
	- [Thread Local Kullanimi](#thread-local-kullanimi)
		- [Is parcalarinin calisma senaryolarina gore degiskenlerin erisilebilirlik durumlari](#is-parcalarinin-calisma-senaryolarina-gore-degiskenlerin-erisilebilirlik-durumlari)
		- [Seperate](#seperate)
		- [Shared](#shared)
	- [Volatile Anahtar kelimesi](#volatile-anahtar-kelimesi)
	- [Atomic degiskenler](#atomic-degiskenler)
		- [Atomic Boolean](#atomic-boolean)
		- [Atomic Integer](#atomic-integer)
		- [Atomic Long](#atomic-long)
		- [AtomicIntegerArray](#atomicintegerarray)
		- [AtomicLongArray](#atomiclongarray)
		- [Atomic Reference](#atomic-reference)
		- [Compare And Swap Concept \( CAS \)](#compare-and-swap-concept--cas-)
		- [A-B-A Problem](#a-b-a-problem)
		- [Atomic Stamped Reference](#atomic-stamped-reference)

<!-- /MarkdownTOC -->

# java101

https://github.com/keramiozsoy/java101/find/main

# BIRINCI BOLUM


## Java Nedir ?


Java hem bir dil hem de bir ortam olarak dusunebilirsiniz.

Dilin kullanildigi yerlere birkac ornek verelim.

 - Web uygulamalari
 
 - Masaustu uygulamalari

 - Oyunlar 
 
 - Android gibi temel gucu buyuk oranda java tarafindan gelen mobil uygulamalar gelistirebilirsiniz.



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


	JDBC Yazdigimiz kod ile veritabanina ozel yazilmis kutuphaneler
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

 - Nesneye yonelik programlamaya uygun olmasi programlarimizi yazarken daha uygun gelistirmeler yapmamizi sagliyor.

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

Bit kavramini ogrendikten sonra nasil calistigina bakabiliriz.

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

    	- Java uygulamalarinin calismasi icin gereken kutuphaneleri barindirir.

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

Degiskenler ile ilgili ornekleri asagidaki siniftan inceleyebilirsiniz.

 - https://github.com/keramiozsoy/java101/tree/main/java101/src/main/java/examples/VariableExample.java


### Nesne Degiskenleri


Bir sinif icerisinde tanimlanir ve sinifin tum nesneleri, ornekleri icin farkli degerler icerebilir.


Peki Sinif nedir? 

	Soyut veya somut kavramlari karsilayacagimiz programlarimizin ana bilesenleridir.



Ornek 

	  Elimizde bir kitabimiz olsun. 
	  Kitabin var olmasini saglayan parcalara bakalim;
	   
	   - yazar adi
	   - tur
	   - renk
	   - sayfa sayisi 
	   - basilan matbaa



Bu kitaba ait kalibimiz olsa, kolayca kitap uretebiliriz. 

Peki program yaziyoruz programimiza tanimlamak icin ne yapariz?

	- kitap isminde bir sinif olustururuz
	- kitabi olusturan bilgi parcalarini tanimlamak icin sinif icerisinde nesne degiskenleri yani yazar adi, tur, renk gibi bilgileri tutariz.



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


Siniflarin icindeki metotlarin icinde kullanilmak uzere bulunan, kapsami metot parantezlerinin ici olan degiskenlerdir.


## Depolanan veriler nerede tutulur ?


- Static alan ( RAM )
		
		Static degisken ya da metotlar RAM uzerindeki heap alaninda tutulurlar.
		
		Java 8 den once PermGen(Permenant Generation), 
		sonra ise Metaspace isimli kalici bolgede konumlanirlar.

		Peki farklari nedir?
		PermGen sabit hafiza boyutuna sahipti ve hafiza doldugunda problem yasaniyordu,
  		Metaspace otomatik olarak boyutunu kendi arttiriyor.


- Stack  ( RAM )
- Heap   ( RAM )
- Kaydedilen dosyalar ( Hard Disk )


## Stack Kavramı

Javada kullanılan primitif ve yerel değişkenler ile objelerin referanslarının 
tutulduğu hafıza bölgesine stack diyoruz. Bununla birlikte, java memory management için
Stack yığın yapısının Last In First Out ( LIFO - Son giren ilk çıkar ) türünü  kullanmaktadır. 

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
	Yani ilgili değişkenin değerinin bir kopyası methoda argüman olarak gönderilir.

	- --> calculate methoduna geçildiği anda artık main metod out-ouf-scope durumuna gelir. 
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
- Stack üzerinde herhangi bir değer kalmadığında, JVM tarafından ilgili stack hafızadan silinir. 




		Java’da bütün lokal değişkenler stacklerde tutulur,
		method çağırımı sonra erdiğinde jvm tüm değerleri
  		sileceği için stack boş kalacaktır,
  		böylelikle bu değişkenler hafızada yer kaplamaz. 

		

		Ek bilgi : Java’da her bir thread ın kendisine ait bir yığını bulunur.
  		Bu da sizin oluşturduğunuz her thread in hafızada yer kaplayacağı anlamına gelir.
  		( Thread kavramı ve memory management nasıl olur bir araştırma konusu olsun lütfen. )




## Heap Kavramı

Stack kavramından bahsederken, stack üzerinde local değişkenlerin tutulduğundan bahsetmiştik. 

- Heap dediğimiz şey ise aslinda Java tarafından nesnelerin tutulduğu yerdir. 

Java’da new anahtarı ile oluşturulan tüm nesneler memory de Heap denilen  
ve JVM tarafından yönetilen yerde saklanır.

Yani javadaki tüm Objeler Heap üstünde tutulur. 

- Siz bir java uygulamasını çalıştırdığınızda, 

JVM sizin için memory de bellek tahsis(allocation) yapar ve
bu yapılan tahsis içerisinde de bu bölümleri ayırır. 

(Bir java uygulaması için minimum bellek ihtiyacı ne kadardır? 
Çok fazla bellek ihtiyacımız varsa bunu nasıl yapabiliriz? ) 




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
- String value = data.get(1) dediğimizde, listenin birinci elemanındaki değeri yeni bir değişkene atıyoruz.
  value isimli bir değişkenin stack üzerinde String objesinin referansını tuttuğunu görüyoruz.
  Dikkat ederseniz, burada aynı objeye iki farklı referans veriyoruz.
  Liste içerisinde bulunan List objesi içerisinde birinci String içerisindeki eleman ile
  Stack üzerinde bulunan value değişkeninin referansı aynı yere bakıyor.
  İşte bu da Java’da nesnenin referansini kullanmak olarak karsimiza cikiyor. 



2
- Stack üzerinde bulunan myList objesi artık out-of-scope durumundadır ve biz bu değişkene erişim yapamıyoruz, erişebildiğimiz değişkenler data ve value değişkenleridir. 


3
- data.add(“Four”) ile liste objesine artık yeni bir string değer daha ekliyoruz. 


4

- Listenin tüm elemanları yazdırıyoruz ve sonrasında value ve data değişkenleri stack üzerinden siliniyor çünkü metodumuz bitti. 





## Veri Tipleri


Yazdigimiz programlarin kullanmasini istedigimiz bilgileri, veri tipleri ile siniflandirabiliyoruz.

Harf, kelime, cumle veya bircok farkli sayi gosterim seklini farkli veri tipler araciligi ile programimiza tanititabiliyoruz.

	- Java tip-guvenli (type-safe) bir dildir. Bu durum, degisken tanimlamak istedigimizde mutlaka veri tipinin ne oldugunu tanimlamak zorunda 
	oldugumuzu ifade eder.


### Ilkel Veri Tipleri



	Primitive Tip		Uzunluk		Minimum Değer		Maksimum Değer		Varsayılan Değer 	Sinif-Nesne Tipi

	char			16 Bit		Unicode 0		Unicode 2^16-1		‘\u0000’			Character

	long			64 Bit		-2^63			2^63-1			 0L				Long

	int			32 Bit		-2^31			231-1			 0 				Integer

	short			16 Bit		-2^15			215-1			 0 				Short

	byte			8 Bit		-2^7			2^7-1			 0 				Byte

	double			64 Bit		-3.4*10^38		3.4*10^38		 0.0d 				Double

	float			32 Bit		– 1.7*1038		1.7*1038		 0.0f				Float	

	boolean			1 Bit								false				Boolean




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

Bununla birlikte ek bir not olarak;  Java derleyicisi gerektiğinde tanımlanan her ilkel veriyi ait olduğu sınıfa otomatik olarak gömer buna kutulama (boxing) olarak adlandirilir ya da derleyici gerektiğinde bir sınıf nesnesini ilkel veri tipine döndürür buna da kutu açma (unboxing) olarak adlandirilir. Her iki işlemi de Java derleyicisi kendiliğinden otomatik yapar.



##### Referans Veri Tipleri ayni objeyi gostermesi

Ornek 
	Iki adet obje tanimlayip ayni referansa baglayalim.
	Ayrıca bir referans değişkeninde saklanan bir nesnenin 
	referansını başka bir referans değişkenine atayabilirsiniz. 
	Bu gibi durumlarda, her iki referans değişkeni de bellekteki aynı nesneye atıfta bulunacaktır.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/VariableAssignSameObject.java


VisualVM aracini heap alanindaki bilgilere bakmak icin inceleyebilirsiniz.

https://www.youtube.com/watch?v=Bu-P0aZyOfE
	
https://programmer.group/test-outofmemoryerror-exception.html



# IKINCI BOLUM YARIN DEVAM EDELIM


## Operatörler

	- Operatörler islem ozelligi olan simgelerdir. 

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



Ornek 

	Buyuk Integer isimli siniftan olusturulan iki farkli degiskeni karsilasitralim. 


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/CompareOperatorsWrapperClassEquals.java



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

					2 uzeri 0  = 1
					2 uzeri 1  = 2
					2 uzeri 2  = 4

					a = 5 = 0101 (In Binary)
					b = 7 = 0111 (In Binary)

					Bitwise AND Operation of 5 and 7
					  0101
					& 0111
					 ________
					  0101  = 5 (In decimal) 

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

	1 ile 5 arasindaki rastgele secilen bir sayinin bulunmasi istenilen  programi yazmak icin while kullanabiliriz.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopWhileRandomNumber.java




### do while dongusu


- Do while dongusu, en 1 kez bekledigim bir islem calissin ve ardindan kosuluma gore programim calismaya devam etsin.

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

	Carpim tablosunu ekrana yazdiran donguyu yazalim. Ic ice iki dongu kullanalim.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopForInFor.java



Ornek 

	10 dan geriye dogru sayilari yazdiran donguyu yazalim.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopForDecrement.java




Ornek 

	for dongusunde sonsuz dongu olusturalim.



https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopForInfinitive.java



### for each 

Genellikler elimizdeki listelerin elemanlarini tektek gezerken bu yapiyi kullanabiliriz.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopForEach.java



### Continue anahtar kelimesi kullanimi


Ornek

- 5000 e kadar olan tum 5 e bolunebilen sayilari ekrana yazdiran programi yazalim.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopBranchingContinue.java



Ornek 

- Continue ile jump ornegi

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/LoopBranchingContinueWithJump.java




# BESINCI BOLUM YARIN DEVAM EDELIM


## String Operations


Soru

String in primitive tipi nedir ?


<details>
<summary> Sorunun Cevabi Icin Tikla</summary>
<p>
	
```bash
		
		- String aslinda,  

		- char tipindeki verilerin bir listeye/diziye atilip gosterildigi tip oldugundan 
		
		- en kucuk yapi tasi 

				java 8 ve oncesi char tipinde,
				java 9 ve sonrasi daha hafiza acisindan daha verimli olacak sekilde byte tipinde de tutuldugunu gorebiliriz.

```

</p>
</details>


Ornek

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/StringPrimitive.java


### String Karsilastirma

== veya equals() metotlari ile hangi bilgilerin karsilastirildigini daha once gormustuk.


String tipindeki bilgilerin ek olarak compareTo() metodu ile karsilastirilma islemi vardir.

Comparable interface temel tiplerin karsilastirilmasinda compareTo() ( Long - Long, String - String, Boolean - Boolean vb.)
kullanilmaktadir.

Kendi olusturdugumuz siniflar icin de Comparable interface kullanarak siniflarimizi karsilastirabiliriz.

Arastirip inceleyebilirsiniz.



### String Length

- Yazinin boyutunu alma islemi

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/StringLength.java


### String Upper Case & Lower Case

- Harfleri buyutme, harfleri kucultme


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/StringUpperCaseAndLowerCase.java



### String indexOf 

- Istenilen bilginin hangi indeks degerinde oldugunu yazar. Index terimi 0 dan baslar.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/StringFindingIndexGivenString.java


### String charAt

- Verilen index degerindeki karakteri geriye doner.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/StringCharAt.java


###  String Concatenation

- Java da + operatoru ile iki String ifadeyi birlestirebiliriz, fakat yeni String olusturup bize donus saglanir.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/StringConcatenation.java



###  String Trim

- Sadece basindaki ve sonundaki bosluklari siler

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/StringTrim.java



###  String SubString

- Parametre olarak verilen indeks sayisinda gore istedigimiz String veriyi elde etmememizi saglar.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/StringSubString.java



### String Manupilation

- String yapisi geregi olusturulup bir referansa atandiktan sonra tekrar degistirilemezler.

- String manipülasyonu yapmamız gerektiğinde sonucu yeni String degiskenine atamak zorunda kaliyoruz. 

- Dolayisiyla String referans tipi oldugu icin HEAP te yeni yerler kaplanmaya basliyor.


Eger tanimladigimiz String degiskenin referansinin gosterdigi degerler uzerinde degisiklikler,guncelemeler yapmak istiyorsak

StringBuilder veya  StringBuffer adlandirilan diger String olusturma siniflari kullanilir.


	StringBuilder

	- Uzerinde islemler yapildiktan sonra HEAP te gosterdigi alanin yeri degismiyor.
	- Diger tipe gore daha hizlidir

	- Thread(Is yapan parca) islemlerina karsi korumasi yoktur. (Not tread-safe ).
 	( synchonized kod blogu icermememektedir. )
	- Yani iki farkli Thread ayni StringBuilder degiskeni uzerinde
 	islem yaparsa birbirini etkiler ve dogru sonuc uretemezler.



	StringBuffer
	
	-  Uzerinde islemler yapildiktan sonra HEAP te gosterdigi alanin yeri degismiyor.
	-  Thread(Is yapan parca) islemlerine karsi korumasi vardir. (tread-safe ). ( synchonized kod blogu var. )

	-  Yani iki farkli Thread ayni StringBuffer degiskeni uzerinde islem yapilmasi 
 	otomatik engellenir. Birbirlerini etkilemeden dogru sonuc uretilir.
	-  Diger tipe gore daha yavastir.



- Asagidaki ornekler birbirinin aynisi sadece siniflar farkli. Thread islemlerini ogrendikten sonra buraya 
thread ile olan karsilastirmayi ekleyebiliriz.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/StringBufferExample.java
https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/StringBuilderExample.java


## Math Operations


### IEEE-754 Virgullu Sayi Gosterimi


	a = 5 = 0101 (In Binary)

	Elimizde sayi gosterebilmek icin sadece 4 hane oldugunu varsayalim.

	Gosterilecek en buyuk sayi 

	1111

	Gosterilecek en kucuk sayi 

	0000


	Virgullu sayilar icin virgulun bir yerde oldugunu varsayarak gostermeliyiz.

	11,11  

	00,01
	00,00


	Elimizdeki hane sayisina gore sayinin alacagi degerin buyuk olmasi veya 
	virgulden sonra kac basamak detayli/hassas sayiyi gostermek istiyoruz bilgisine gore 
	karar vermemiz gerekiyor.


	111,1

	1,111
	0,001


	Bir şeyi elde etmek için başka bir şeyden vazgeçmek zorunda olmak 
	durumuna Trade Off kavrami deniliyor. Yukaridaki ornek bu kavrami desteklemis oluyor.

	IEEE denilen kurum yani Amerika Elektrik Muhendisligi Odasi yukaridaki durumun 
	gosterilmesi icin bir standart ortaya koymuslar.

	Sebebi bir yerde gosterilen sayi ile farkli yerde gosterilen sayilarin formati 
	ayni olsun ki tek bir noktada anlasilabilsin.

	Hatta bununla ilgili cok meshur bir hikaye var 

	Intel islemci firmasi bu standarti kabul etmeden once kendi standartini kullaniyor.

	Intel Pentium isimli islemci (1994) kullanilan bilgisayarlarda farkli programlar IEEE kullanirken islemci operasyonlari
	kendi standartini kullandigi icin cevirme islemlerini dogru yapamadigi icin
	
	Windows 1 sene boyunca hatali bir sekilde bilgisayarlardaki hesap makinelerinin 
	yanlis calismasi problemi ile karsi karsiya kalmis. Daha sonra bunu yazilim guncellemesi ile duzeltiyorlar.




Ornek 

- Maasimizin 3 te birini yatirim yapacagiz. Ve 3 ay sonra ne kadarlik para biriktigine bakalim.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsFloatingPointProblem.java


- Yukaridaki problemin BigDecimal sinif ile cozumu


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsBigDecimal.java



### Bir kac farkli durum icin java derleyicisinin nasil ciktilar verdigine bakalim.

-  int bir sayinin sifira bolunebilmesi 

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsIntValueDivideByZero.java

-  float bir sayinin sifira bolunebilmesi 

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsFloatValueDivideByZero.java

- sifirin sifira bolunmesi 

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsFloatZeroDivideByZero.java



### Math.abs

- Verilen parametrenin mutlak degerini alir. Sayinin pozitif degerini yazdirir.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsAbs.java

### Math.ceil 

- Verilen parametrenin yukari yonde en yakin olan int degerine yuvarlanmasi saglanir.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsCeil.java

### Math.floor

- Verilen parametrenin asagi yonde en yakin olan int degerine yuvarlanmasi saglanir.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsFloor.java

### Math.floorDiv

- Verilen parametrelerde verilen int veya long degerlerini birbirine boler 
en yakin olan int degerine yuvarlanmasi saglanir.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsFloorDiv.java


### Math.round

- Matematiksel olarak hangi sayiya daha yakin ise o yonde yukari veya asagi yuvarlama yapar

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsRound.java

### Math.min

- Verilen parametrelerden kucuk olani bulmamizi saglar.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsMin.java


### Math.max

- Verilen parametrelerden buyuk olani bulmamizi saglar.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsMax.java


### Math.pow

- Verilen parametrelere gore ust alma islemi yapar.

https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsPow.java


### Math.sqrt

- Verilen parametrenin kok alma islemini yapar.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/MathOperationsSqrt.java




## Wrapper Classes Cache Mechanism


Java da new anahtar kelimesi ile nesneleri nasil olusturacagimiz biliyoruz.

Bir sinifin ornekleri/elimizdeki kaliptan bir kopya olusturmanin farkli yollari var.

- Class.forName() ve Class.newInstance()
- ClassLoader loadClass()
- Object.clone()
- Serialization Deserialization
- Reflection mekanizmasi kullanarak 


		Java da olusturulan yeni bir ornek, heap alaninda hafiza alani kaplayacaktir
		bu nedenle yeni nesneler olusturmak her zaman pahali bir islemdir.

		Bu pahali nesne olusturma surecinden kacinmak, 
		elimizdeki kaynaklari dogru yonetmek icin
		zamanla bazi yapilar gelistirildi.


		Java da sarmalayici(wrapper) siniflar degerleri degismez(immutable) demistik.

		Ornegimiz String ti. 

		JDK tarafından sağlanan sarmalayıcı sınıfları, yani her bir sarmalayıcı sınıfı, 
		kendi türünde yaygın olarak kullanılan örneklerin bir listesini önbellek biçiminde saklar 
		ve gerektiğinde bunları kodunuzda kullanabilirsiniz. 

		Program çalışma zamanınızda çok sayıda byte alani kazanmamiza yani az alan tutmaya yardımcı olur.
		Yani onbellege(cache) alma islemi yapmaya calisir. 





- String degerler icin String Pool kavramini arastirabilirsiniz.

		String user1 = "admin";
		String user2 = "admin";
		String user3 = new String("admin");  // Not in the pool
		
		System.out.println(user1 == user2);  // true
		System.out.println(user1 == user3);  // false

		---
  
		String user1 = "admin";
		String user2 = "admin";
		String user3 = new String("admin").intern();  // Now added to the pool
		
		System.out.println(user1 == user2);  // true
		System.out.println(user1 == user3);  // true



### Integer Sinif


Integer tanimalamak icin bildigimiz yontemler


		// Integer i = 10; // Buna emin degilim.
		Integer i = Integer.valueOf(10);


Yukaridaki iki yontemden birini yaptiginizda sonraki adimlar icin
Onceden olusturulmus bir Tamsayi referansi olacagindan yeniden olusturmak yerine i degeri donulur.

		Integer i = new Integer(10);

Eger new anahtar kelimesini kullanirsak onbellege alma islemi yapmayacak.




Integer sinifinin icinde IntegerCache denilen bir sinif var.

Ve deger atamasi yapildiginda onbellege yazma islemini sinif icinde bir degiskene atarak yonetmeye calisiyor


	private static class IntegerCache
	{
	    private IntegerCache(){}
	    static final Integer cache[] = new Integer[-(-128) + 127 + 1];
	    static {
	        for(int i = 0; i < cache.length; i++)
	            cache[i] = new Integer(i - 128);
	    }
	}


	public static Integer valueOf(int i)
	{
	    final int offset = 128;
	    if (i >= -128 && i <= 127) // must cache
	        return IntegerCache.cache[i + offset];
	    }
	    return new Integer(i);
	}



Yukaridaki onbellege olusturma adimini nedeniyle sure biraz dah uzun olabilir. Fakat 
eger tekrar tekrar kullanacaksak cagirdigimizda normal durumdan daha hizli ericegiz.

Buradaki asil fayda ayni hafiza alanini tekrar tekrar kullanmak.


Ornek

		Asagidaki durumda ilk karsilastirma true,
		ikinci karsilastirma false alacak. Cunku 
		new Integer() digerlerinden ayri sekilde alan ayrilip verisi yazilmis oldu.


Sonuc 

		On bellegi kullanmak istiyorsak ya 
		- ilk deger atamasi yaparken ilkel tip atayacagiz,
		- valueOf() kullanacagiz.


https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/CacheIntegerDemo.java



## Case Study

Buraya kadar olan konular ile ilgili sorulari inceleyelim.


		Disaridan girilen iki tam sayi (pozitif veya negatif) arasindaki sayilarin toplamini hesaplayan
        programi yazalim. Girilen sayilar toplama dahil edilmeyecektir.

        Kurallar:
        iki sayi da 0 olamaz
        iki sayi arasindaki fark 1 olamaz.
        her durum icin programin kullaniciyi uyarmasina gerek yok, calissin yeter.


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/CaseStudySumOfBetweenNumbers.java



		Iki tane integer sayi tanimlayiniz ve ilk degerlerini atayiniz.
		Ucuncu bir degisken tanimlamadan, iki degiskenin degerlerini degistirip yazdiriniz.


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/CaseStudySwapValuesWithoutTemporaryValue.java

        
        Tekrar eden sayiyi ekrana yazan kod parcasini ekleyiniz.
        
        7, 9, 5, 5, 1, 3 

        Kurallar
        Sadece verilen patterne uygun calismasi yeterli
        bulduktan sonra dizinin devamini kontrol etmeye gerek yok


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/CaseStudyOneForFindDuplicationValue.java

	

Asagidaki sekli ekrana yazdiran programi yaziniz


		      #
		    # #
		  # # #
		# # # #



- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/CaseStudyShapeTriangle.java


## Fonksiyonlar

## Diziler


## Kalitim ve Komposizyon

Nesne yonelimli programlama dili kullanma amaclarindan biri yazdigimiz kodu yeniden kullanmaktir.

Kodu yeniden kullanak icin iki farkli yontem var.
	
	- KALITIM 	( Inheritance ) (IS-A)
	- KOMPOZISYON   ( Composition ) (HAS-A)


### KALITIM

Siniflarin birbirinden veya arayuzlerin (interface) birinden kalitilmasi islemidir.
	
	A IS-A B type of thing 



		class Apple extend Fruit {

		}

		Elma bir Meyvedir. 
  		Kalitim tek yonlu oldugu icin her elma bir meyvedir
    		fakat her meyve elma degildir.


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/InheritanceClassOfAppleYellow.java

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/InheritanceClassOfAppleRed.java

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/InheritanceClassOfFruit.java


		interface Car extend Vehicle {

		}

		Araba bir Aractir.
  		Kalitim tek yonlu oldugu icin her araba bir aractir
  		fakat her arac bir araba degildir.

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/InheritanceCarIsAVehicleOfThingClassOfRedCar.java

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/InheritanceInterfaceCar.java

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/InheritanceInterfaceVehicle.java


### KOMPOZISYON

Basitce objelerin referans nesnelerini kullanmak.

	A HAS-A B variable

	class Classroom {

	}

	class University {

		This class HAS-A list of classrooms

	}


	Derslik tanimlanmis. Universite de dersliklere sahiptir. 
	Dersligi olmayan universite olamaz. Bu nedenle HAS-A iliskisi tutulmustur.

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/CompositionMain.java

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/CompositionUniversity.java 

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/CompositionClassroom.java 


### POLIMORFIZM


Polimorfizm ornekleri daha sonra ekleyecegim.

Soru 

	Ne zaman hangisini kullanalim ?

	Kalıtımı yalnızca kodu yeniden kullanmak için kullanmayın
	Eğer gerçekten istediğiniz tek şey kodu yeniden kullanmaksa ve görünürde bir ilişki yoksa, kompozisyonu kullanın.

	Kalıtımı sadece polimorfizme ulaşmak için kullanmayın
	Eğer gerçekten istediğiniz tek şey bir polimorfizmse, ancak doğal bir IS-A ilişkisi yoksa, arayüzlü kompozisyon kullanın.

	Aralarinda iliski oldugunda kalitim kullanin.



## Eşzamanlılık ( Concurrency ) ve Paralellik ( Parallelism )

Onceki bolumlerde gordugumuz uygulamalar hep siraliydi;

- Program baslar 
- Kurallara gore calisiyor
- Tum islemler tamamlaninca program sonra eriyor.

Ornek 

		public class Hey {
			public static void main (String args[]){
				System.out.println (" Hey Hey Hey !!!! ");
			}
		}


Bazi durumlarda ayni anda birden fazla isi yapma istegi olusabilir.

Ornek 
	
	Tarayicilari dusunelim.
	Acilan bir sekmede yazi okurken, 
 	diger sekmeden fon muzigi olarak dinlemek istedigiz sarkiyi acabilirsiniz.

veya

	Bilgisayarinizda bilgidiniz dosyayi aramak istiyorsunuz, arama bolumune 
	dosya ismini yazdiniz, arama islemi basladi. 
	Siz bu aramanin bitmesini beklemeden 
	hesap makinesi uygulamasindan islemler yapabiliyorsunuz.

	Hesap makinesinde islem yapabilmek icin dosya aramasini bitmesine gerek yok.


Bazi kavramlari ogrenelim.


		Process, bilgisayarimizdaki bir program calistirilip bellekten yer tahsis 
		edildikten sonra calisma suresi boyunca biz ona bu ismi verebiliyoruz.


		Calisan bir program yani process altinda yer alan, yapilan her bir is parcasina Thread olarak adlandirilir.


		Bir process; yani calistirilmis bir program calistirilan ilk andan hayatinin
		 son anina kadar ana is parcasi ( main Thread)  olarak adlandirilan yapinin icinde kalir.
		Bu yapilara Single Thread olarak adlandirilir


		Bu main Thread yardimi ile bir cok alt is parcasi (child thread) olusturulabilir.
		Bu yapilara Multi Thread / Multithreading olarak adlandirilir.



### Merkezi Islem Birimi ve Cekirdek nedir, Is parcalari ile iliskisi nedir 

	Merkezi Islem Birimi, CPU (Central Process Unit) veya Islemci kavrami 

	bilgisayardaki tum islemleri, isletim sistemini ve altinda calisan programlari yoneten birimdir.

	Bu islemleri yonetmek icin islemciler fiziksel olarak var olan cekirdek ( core ) denilen yapilara ihtiyac duyar.

	- Dual core ( 2 )
	- Quad core ( 4 )
	- Octa core ( 8 )


Peki neden farkli sayilarda cekirdek sayisina sahip yapilar var ?

	Genel olarak bir islemcide cekirdek sayisi ne kadar fazlaysa 
	islemcinin calisma kapasitesi de o kadar hizli olur.
	Asil amac hiz :)


Detaylandiralim;
	
		8 cekirdekli bir islemcide 8 adet fiziksel cekirdek mevcutken,
  		ayni anda maksimum 8 is parcacigi (Thread) calistirilabilir. 
  		Hyper-threading ozelligi olan islemcilerde 16 adet is parcacigi (Thread) 
    		ayni cekirdekte 2 tane is parcacigi (Thread) calisacak sekilde tasaarlanmistir.

### Neden Multithreading yapilara ihtiyac vardir

Multithreading, aynı uygulama içinde birden çok iş parçacığına sahip olduğunuz anlamına geldigini soylemistik.
	
- Bir uygulamaya ait bircok is parcacigi bir CPU uzerinde calisabilir
- Bir cok CPU bir uygulamanin farkli is parcaciklarini ayni zaman periyodu icinde calistirabilir.

Yukaridaki durumlardan dolayi aslinda asagidaki ihtiyaclari karsilayabiliyor
	
-  Tek CPU icin fayda saglayan kullanim

		Bir iş parçacığı ağ üzerinden gönderilen bir isteğe yanıt bekliyorsa,
		başka bir iş parçacığı bu arada CPU'yu başka bir şey yapmak için kullanabilir


-  Birden fazla CPU nun beraber daha cok fayda saglayan kullanim

		Tek is parcacigi tek CPU kullanabilir, uygulamamizi 
		cok is parcacikli hale getirirsek bircok CPU yu beraber kullanabiliriz.

-  Daha iyi bir kullanici deneyimi
	
		Bir uygulamamizin ekraninda bilgiler ve bir buton olsun.
		Butona tiklayalim.
		Buton gorevi ağ üzerinden bir istek atma olsun.
		Bu isteği hangi iş parçacığının gerçekleştirdiği önemlidir.
		Ekrandaki bilgilerin guncellenmesi islemi ayni is parcacigi (Thread) icinde gerceklesirse
		kullanici ag uzerindeki istek cevap verene kadar ekrandaki bilgilerin guncellenmesini
		beklerken sayfa sanki asili kalmis gibi hisseder. 

- Adil Paylasim 

		Kullanilan bilgisayarin kullanicilar arasinda adil seklinde paylasilmasidir.

		Istemcilerden istek alan ve bu istekleri yürütmek için yalnızca bir iş parçacığına 
		sahip bir sunucu hayal edin. 
		Bir istemci işlenmesi uzun süren bir istek gönderirse, 
		diğer tüm istemcilerin isteklerinin o istek bitene kadar beklemesi gerekir.
		Her müşterinin isteğinin kendi iş parçacığı tarafından yürütülmesi saglanabilir.

### Multithreding Maaliyetleri

- Tek bir thread ile yapilacak isi coklu thread ile yaptigimizda bazen thread lerin
arasindaki ayni veriye ulasma islemlerinden dolayi yonetilmeleri gerekir.
Bu nedenle aslinda basit yapidan karmasik yapiya gecmis oluyoruz.
Yonetimi dogru yapilmadiginda tespiti ve duzeltilmesi tek thread yapilara gore daha maliyetlidir.

- Baglam Degistirme maaliyeti (Context Switching)
bir thread altindan diger thread ler olustugunda aslinda CPU tum bu 
thread lerin durumlarini (RUNNING,LOCKED,WAITING),
en son kaldigi yeri veya verilerini tutmak zorunda kaliyor.

- Artan kaynak tuketimi (Resource Consumption) yonetilmelidir. Kimse bosta duran 100 tane thread
bellekte yer kaplasin istemez.


### Multitasking nedir?

- Eskiden bilgisayarlarda tek CPU ile ayni anda sadece tek uygulama calisiyordu.

- Simdi bilgisayarlar bircok programi ayni anda calistiriyor.
 
- CPU lar, programlar arasında paylasilip, Isletim sistemi yardimi ile çalışan programlar arasında geçiş yaparak ve geçiş yapmadan önce her birini bir süre çalıştırır. 

- Zaten gorev yoneticisinden baktigimizda, CPU larin uygulamalar arasindaki kullanim yuzdeleri surekli degistigini gorebiliriz.


#### Concurrency

		Elimizdeki tek bir isi (process) alt islere (thread) bolerek, alt islerin 
		neredeyse ayni anda
		ayni hafiza alanina veya
		ayni dosyalara veya
		ayni veritabanina
		yazip okumaya calisabilmesini sagladigimiz duruma Eşzamanlılık ( Concurrency ) denir.
		Neredeyse diyorum cunku bilgisayarimizdaki islemci, bagimsiz is parcalarinin 
		ne zaman baslayip bitecegine kendisi karar veriyor.
		Son kullanici aslinda ayni anda calismis gibi hissediyor fakat programi yazdigimizda
		farkli gorebiliyoruz.
		Bu sekilde daha az surede daha hizli ciktilar uretebiliyoruz.

( Shared State )

		Ayni hafiza alanlarinin kullanilmasi aslinda bazi problemlere neden oluyor. 
		Birden fazla is parcasi ayni yerde calisip yanlis sonuc uretebiliyor. ( race condition )
		Birbirini cagiran ve asla sonlanmayacak is parcalari ( dead lock )

( Seperate state ) 

			 Ortak alani paylasarak yazma, okuma yapmiyorlar 
			 fakat kendi aralarinda bulunan degismez objeleri ( immutable objects ) veya
			 degisen objelerin kopyalarini birbirileri ile degis-tokus yaparak 
			 son hamlelerini yapmadan once her zaman son bilgiye ulasabiliyorlar. 
			 Boylece ayni yere yazma, yanlis son veriyi okuma gibi problemlerden kaciniyorlar.
				

			 veya 


					 Her is parcasi tamamen ayni talimatlari uyguluyarak isin tamamini kendi baslarina bastan sona bitiriyorlar.
					 
					 Ornek 
					 	3 araba uretilme isini,  3 calisana  her biri tek basiniza calisarak hazir hale gerirecegi durumdur.


			 veya

				 	Her is parcasi kendi isini baslatip sonra cevabini beklemeden diger is parcasinin kendi isini baslatabilmesini sagliyor

				 	( asenkron ( non-bloking,reactive) )

				Ornek 
				 	### WORKER #### -> ### WORKER #### -> ### WORKER #### -> ### WORKER ####
				 	|						|					|				|
				 	Is basla 			Is basla 			Is basla 		Is basla
			 		 


			 objelerin durumlarinin birbirinden ayri sekilde korunabildigi yapilar populer olmustur. 

			 ( event driven )
			 

			 Ornek
			 		A 

			 	bir satir bir kolon olan tabloda elimizdeki deger 5
			 	bir islem geldi 1 artti ve o satir guncellendi    6 
			 	bir islem geldi 1 azaltti ve o satir guncellendi  5
			 	bir satir bir kolon olan tabloda elimizdeki son deger 5


			 		B

			 	bir satir bir kolon olan tabloda elimizde deger   5
			 	bir satir daha eklendi ve kolona +1  yazildi		  
			 	bir satir daha eklendi ve kolona -1  yazildi  
			 	biz artik sonuc ne oldu ogrenemek icin tum kolonlardaki islemleri yaptiktan sonra cevabi ulasiyoruz 
     				yani 5
			 	istersek onceki durumlara da ulasabiliyoruz veya geri donebiliriz.
			 	bu yontemle tum objelerin kendi durumlari korundu ve asenkron olarak bagimsiz islem yapildi.

			 Bazi projeler
			- java.util.concurrent
			- Java NIO adli java icindeki paket
			- Node.JS 
			- Netty.io
			- Akka.io
			- Vertx.io
			- Eventuate.io
			- Axoniq.io
			
			- LMax Disrupter 
			- Java 7 Fork and Join framework
			- Java 8 Collection streams API 


	

#### Parallel Execution( Paralel Calismak ) ve Parallelism ( Paralellik,Dagitik)

	Her cekirdek farkli gorevleri yerine getirebilmesine  Parallel Calismak denir.

	Fakat 

	Birden fazla cekirdek ayni görevin birkaç alt is parcasini tam anlamıyla aynı anda çalışmasına 
	paralellik,dagitik (Parallelism) denir. Bir CPU da uretilen alt gorev baska cpu userinde kosabilir.
	Her göreve veya alt göreve bir çekirdek atayarak, CPU'nun çok çekirdekli altyapısını kullanarak 
	aynı anda görevlerin bölümlerini VEYA birden fazla görevi fiziksel olarak çalıştırır.




### Genel ozet


- Eşzamanlılık, iki görevin çakışan zaman dilimlerinde başlatılabileceği, çalıştırılabileceği ve tamamlanabileceği zamandır. Paralellik, görevlerin tam anlamıyla aynı anda çalışmasıdır,

- Eşzamanlılık, bağımsız olarak yürütülen süreçlerin bileşimidir, paralellik ise (muhtemelen ilgili) hesaplamaların eşzamanlı yürütülmesidir.

- Bir uygulama eşzamanlı olabilir ancak paralel olmayabilir; bu, aynı anda birden fazla görevi işlediği, ancak aynı anda iki görevin yürütülmediği anlamına gelir. Parallel ayni anda olur.

- Bir uygulama hem paralel hem de eşzamanlı olabilir; bu, aynı anda çok çekirdekli bir CPU'da birden çok görevi eşzamanlı olarak işlediği anlamına gelir.

- Tek çekirdekli bir CPU'da eşzamanlılık elde edebiliriz, ancak paralellik edemeyiz.

- Eşzamanlı bir sistemde farklı iş parçacıkları birbirleriyle iletişim kurar. 
Dağıtılmış,paralel bir sistemde farklı süreçler veya farkli bilgisayarlar birbirleriyle iletişim kurar. 
Farkli bilgisayarlarin bir arada calistigi sistemler var.  
( Apache Hadoop ile cluster kurulumu, Apache Cassandra NoSql dagitik veri tabani)


### Soru cevaplar ile devam edelim.

SORU
Bir işlemci aynı anda kaç iş parçacığı işleyebilir? 
 - tek cekirdek
 - cift cekirdek
 - sekiz cekirdek

CEVAP
<details>
<summary> Sorunun Cevabi Icin Tikla</summary>
<p>
	
```bash
		Tek bir CPU çekirdeği, çekirdek başına en fazla 2 iş parçacığına sahip olabilir. 

		Örneğin, 
			bir CPU çift çekirdekliyse   4 iş parçacığına sahip olacaktır.
		    bir CPU sekiz çekirdekliyse   16 iş parçacığına sahip olacaktır.
```

</p>
</details>

SORU
Bir görevde bir iş parçacığı mi yoksa çoklu iş parçacığı çalıştırmak daha mı iyi? 

CEVAP
<details>
<summary> Sorunun Cevabi Icin Tikla</summary>
<p>
	
```bash
 Duruma gore degisebilir, Cok fazla thread olusturmanin maliyeti ve bunlarin atama yapilmasi
 tek parca ile yapilacak isin maliyetini, hafiza olarak gecebilir. Gereksiz yere thread acilip kulanilmaya calisilmasi.
```

</p>
</details>


SORU
Daha fazla cekirdek mi yoksa daha fazla thread mi iyidir?

CEVAP
<details>
<summary> Sorunun Cevabi Icin Tikla</summary>
<p>
	
```bash
 	Temel olarak, daha fazla çekirdek ve daha fazla iş parçacığı dengeli sekilde kullanilmasi aslinda en performansli olani.

 	Iki durumu karsilastirmak aslinda garip.

 	Cekirdekler, isi yapanlar gercek CPU lardir. ( Buna araba diyelim )

 	Is parcalari, is yapma istegidir ( Buna surucu diyelim )

 	Aslinda soru, 
 		daha cok arabaya sahip olan bir kisi mi yoksa
 		daha cok surucusu olan bir araba mi gibi birsey oluyor.

 	Çekirdekten daha az iş parçacığınız varsa; ekstra çekirdekler boşa harcanır.

 	Veya
	Geçmişte, birçok oyun birden fazla CPU çekirdeğinden tam olarak yararlanmak için programlanmadığından,
	 yüksek çekirdek sayısına sahip bir CPUya sahip olmak genellikle pek bir şey ifade etmiyordu.
	 Yeni oyunlarda bunalara dikkat etmeye basladilar fakat hala tek cekirdek uzerindeki performans
	 coklu cekirdek uzerindeki calismasindan daha onemli durumdadir.

```

</p>
</details>




Bir ornek ile konuyu genisletelim

	Bir program yazilmasi isteniyor. Elimizdeki dosyalar icin;
	Bir kaynaktan alinan dosyanin icerisindeki kolonlarin alfabetik siraya gore 
	duzenlenip icinde bulundugumuz bilgisayara yazma islemi yapilmasi bekleniyor

		Dosya.txt Dosya2.txt Dosya3.txt Dosya4.txt
		
		C, A, B kolonlari mevcut 

		A, B, C kolonlarina cevir


	 - T1 dk zamaninda;  Bize dosya gonderiliyor biz bunu okuyoruz.
	 - T2 dk zamaninda;  Kaydedilen dosyaya cevirme islemi yap
	 - T3 dk zamaninda;  Okudugumuz dosyayi bilgisayara kaydediyoruz.
	

Yukaridaki 4 dosya icin ortalama olarak tum islemlerin gerceklesme suresi 

	 ( T1 + T2 + T3  ) * DOSYA_SAYISI  ~ = Toplam gecen yaklasik sure


CPU nun verimsiz kullanilmasi diye bir durum var. 

	Eger bir uygulama okuma
	veya yazma islemi yaparken aslinda CPU komutu vermis ve o islemin okumasini
	veya yazmasini bekliyor ve islem suresince bosta bekliyor. 
	Bu verimsiz bir yontem neden beklesin ki ? Calistiralim :)


Yukaridaki gibi tek bir is parcacigi icinde islemleri yaptigimizda gecmesi gereken sureyi hesapladik.

Peki 3 adim icin tek bir is parcasi yerine, 3 ayri is parcasi kullansak sonuc nasil degisir?

	OKUMA islemlerinin hepsi bir is parcasinda olsun,

	HESAPLAMA islemlerinin hepsi hesaplama bir is parcasinda olsun,

	YAZMA islemlerinin baska bir is parcasinda olsun,


Her T ani icin 1 dk sure harcadigini dusunelim.


	Dosya.txt

	====  T1 ( OKUMA ) + T2 ( HESAPLAMA ) +  T3 ( YAZMA )

	==================== Dosya2.txt

	==================== T1 ( OKUMA )     +  T2 ( HESAPLAMA )  +  T3 ( YAZMA )

	=======================================  Dosya3.txt


- Yukaridaki tasarimda HESAPLAMA is parcacigi OKUMA is parcaciginin dogru bir okuma gerceklestirip
gerceklestirmedigini kontrol etmesi lazim. 

- Yani bittigini kontrol etmesi lazim. Cunku birbirinden bagimiz sekilde 
farkli is parcalarinda islemler yapildi.

- Benzer sekilde YAZMA is parcacigi HESAPLAMA is parcaciginin isini dogru yaptigindan hatta bittiginden emin olmasi lazim.

- Kisaca birbirinden haberleri olmasi lazim. Bu tasarim bize problem olusturdu.


		Diger cozum

		Bunun yerine OKUMA HESAPLAMA YAZMA islemi icin bir is parcacigi olsun fakat

		dosya basina ayri is parcacigi uretilebilsin. O zaman ayni anda farkli dosyalar

		icin islemler yapilabilir. Bu tasarimda dikkat edilmesi gereken nokta 

		birinin okudugunu digeri okumayacak veya birinin hesapladigi anda digeri

		de ayni dosyayi hesaplamamasi lazim.
	


### Thread nasil olusturulur ? Thread sinifi veya Runnable arayuzu nasil kullanilir ?


Yazdigimiz uygulamalar aslinda temel olarak main thread olarak bilinen yapilar ile calismaya baslar.

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadMain.java



Ornek 
	
	Elimizdeki 100 adet kutu iki calisan tarafindan satisa sunulmadan once tekrar sayilmasini istiyoruz.

	Esit veya farkli kutu sayilari vererek tum kutulari sayabiliriz.

	Iki calisanin kutu sayma sayilari birer birer veya ikiser ikiser
	olabilir fakat sayma hizlari normal sartlarda ayni olamaz.
	
	Biz gorevi verip calismaya baslayabilirsiniz diyecegiz 
	onlar gorevlerini bitirince bize haber verecekler

	Bir ana is parcasi yazacagiz (main), altinda iki kucuk is parcalari(child) yazacagiz.

	Bu programi yazalim



Kalitimdan ogrendigimiz extends anahtar kelimesi yardimiyla olusturacagimiz islere; sizler birer is parcasisiniz tanimi yapacagiz.


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadByThreadClassMain.java

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadByThreadClassWorker.java


		Thread sinifini kullanarak is parcacigi olusturdugumuz icin 
		
		is parcacigini hazir duruma getirmek icin start()
		calismasi icin run() metodu kullanildi. 


 
Kalitimdan ogrendigimiz interface kavraminin bize sagladigi sadece o is icin bir ozellik ekleme faydasindan
yararlanarak thread olusturabiliyoruz.



- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadByRunnableInterfaceMain.java

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadByRunnableWorker.java




Soru

Is parcasinini tanimlamasini yaptiktan sonra 

Thread.start() yerine Thread.run()  metodu cagirirsak ne olur ?


<details>
<summary> Sorunun Cevabi Icin Tikla</summary>
<p>
	
```bash
		Yeni bir thread olusmaz main thread uzerinde sadece metot cagrisi yapmis oluruz.
```

</p>
</details>


Cevap ile ilgili ornek 

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadRunMethodDirectInvoke.java



Runnable interface sadece tek metoda sahiptir. Java 8 ile gelen asagidaki tanimlamanin bir anlami var.

	@FunctionalInterface 

Soru

Bu kavramin ne anlama geldigini bilen var mi?

<details>
<summary> Sorunun Cevabi Icin Tikla</summary>
<p>
	
```bash
		Java 8 ile gelen Lambda ifadelerini kullanmak icin 
		arayuzun (interface) isaretlenmesi ve 
		icinde sadece abstract olacak sekilde tek metot tutmasidir.
```

</p>
</details>


###  Lambda function kullanarak Thread olusturalim

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadLambdaMain.java

###  ExecutorService kullanarak Thread olusturma

Tek tek her thread olusturulmasi icin kod yazmak yerine,
Executors isimli sinifi icerisindeki hazir yapilari kullanabiliriz.


Executors sinifinda ExecutorService Interface implement eden siniflarin metotlari mevcuttur.

Bu metotlar Thread Pool yapilari olusturulur. 

ThreadPool olusturulurken Queue veri yapısı kullanılır.

Queue , FIFO ( Ilk eklenen ilk cikar ) alt yapisisini kullanir.

Bu metotlardan bir kac tanesini gorelim.


1 newFixedThreadPool

Verilen parametre kadar Thread olusturulur. En uygun yontem JVM in kullanabilecegi yani programin calistigi bilgisayardaki core sayisini parametre olarak verebilirsiniz.

new LinkedBlockingQueue veri yapisi ile olusturulur.

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyExecutorServiceNewFixedThreadPoolMain.java



2 newCachedThreadPool

Hizli başlayıp biten işlerde newCachedThreadPool olan version kullanılırsa, yapilacak is sayisi fazla olsa bile isi bitmis olan thread yeni bir is alir. Bu sekilde gereksiz yeni thread oluşturulması onune gecilir. 

Eger yavas calisan isler ile newCachedThreadPool yapisi kullanılırsa newFixedThreadPool dan hiçbir farkli kalmaz.


new SynchronousQueue veri yapisi ile olusturulur.

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyExecutorServiceNewCachedThreadPoolMain.java



3 newScheduledThreadPool

Parametrede verilen zaman kadar vakit gectikten sonra calismaya baslar.

new DelayedWorkQueue() veri yapisi ile olusturulur.

Uygulama ayaga kalktiktan 10 sn sonra calisacak bir ornek olusturalim.


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyExecutorServiceNewScheduledThreadPoolMain.java



4 Callable Interface ve Future Interface kullanimi

Yukaridaki orneklerde executore service cagirirken Runnable functional interface kullanmaktadir. Bu interface icindeki metod void oldugu icin is bittikten sonra bize bir deger donusu saglayamaz.

Callable interface kullanarak is bittiginde bize geriye cevap donulmesi saglanir.

ExecutorService ve Callable beraber kullanildigi durumda islem bitiminde islemin sonucunu takip edebilmemize icin bize Future tipinde interface ile referans verilir.

Biz Future referansi yardimiyla islem sonunda alinmak istenilen degerlere ulasilir.

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyExecutorServiceFutureCallableMain.java



###  Thread Pool Size neye gore ayarlanir

CPU-bound Isler: (  MATEMATIKSEL FONKSIYONLAR ) Eger islemler CPU'yu yogun bir sekilde kullanirsa, genellikle thread sayisini islemci sayisina esit veya biraz daha az tutmak iyi bir yaklasimdir. Bu, her islemcinin verimli bir sekilde kulanilmasini saglar.


I/O-bound Isler:  ( DOSYA OKUMA YAZMA )  Eger gorevler I/O islemleri ile ilgiliyse daha fazla iş parçacığı kullanılabilir. I/O gorevleri genellikle bekleme süresi (blocking) icerir, bu yüzden daha fazla thread kullanmak sistem kaynaklarını daha verimli kullanabilir.


VisualVM veya GCViewer gibi araclar yardimi ile sistemi izleyerek sizin icin uygun sayilari deneme yanilma ile ulasabilirsiniz.


### Thread yasam dongusunun ogrenelim

Bir thread yasam dongusu boyunca asagidaki durumlarda olabilir.


- https://docs.oracle.com/javase/6/docs/api/java/lang/Thread.State.html

	NEW 

		Bir is parcasi obje olarak olusturulmus fakat start() ile hazir hale getirilmediginde bu durumdadir.
	
	RUNNABLE

		start() ile hazir hale getirildiginde bu durumdadir.
	 
	BLOCKED
		
		Bir is parcacigi koruma olan bir bolgede calisiyor. Calisma uzun suruyor. Ikinci is parcasi birinci is parcasinin 
		calisacagi yerde calismak istiyor. Fakat ilk is parcasi islemini tamamlamadigi surece, ikinci is parcasi 
		bu durumdadir
	
	WAITING

		Bir is parcasinin calismaya devam edebilmesi icin diger is parcasindan sinyal bekledigi durumdur.

	TIMED_WAITING	

		Belirli bir bekleme süresine kadar başka bir iş parçacığının eylem gerçekleştirmesini bekleyen bir iş parçacığı bu durumdadır.

	TERMINATED

		Is parcasinin hayat dongusu bittiginde aldigi durumdur.


#### Durumlarin kod orneklerine bakalim

NEW - RUNNABLE

	Is parcasi ilk olusturuldugunda aldigi durum

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadStateNewAndRunnable.java


Blocked

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadStateBlocked.java


Waiting

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadStateWaiting.java


TIMED_WAITING

	Bir is parcasi belirli bir zaman araligi gectikten sonra calicak ise zamani gecmesini beklerken aldigi durumdur.

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadStateTimedWaiting.java


TERMINATED

	Bir is parcasini baslatmak icin thread.start() metodunu kullaniyoruz.

	Durdurmak icin thread.stop() metodunu kullanabiliriz.

	Fakat stop() metodu is parcasinin devam eden bir isi var mi yok mu diye kontrol etmeden dogrudan
	bir istek atarak sonlanmasini sagliyor.

	Bu durum tehlikelidir. Cunku is parcasinin yapmasi gereken is yarim kalabiliyor.

	Bu nedenle kendimiz ozel olarak is parcacigimizi durduran yapilar gelistirmeliyiz.


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadStateTerminatedMain.java



#### Is parcalarinin birbirilerine sinyal gonderme islemleri

~~~
 java.lang.Object.class isimli sinifimizin 3 adet final anahtar kelimesine sahip metodu vardir.

 wait()
 notify()
 notifyAll()

 final anahtar kelimesi ;
 	- sinif seviyesinde olursa kalitim yapilmasi engellenir.
 	- metot seviyesinde olursa metodun ezilmesi (override - kullanildigi sinifta yeniden yazilmasi) engelenir.
 	- degisken seviyesinde olursa degerleri ilk atandiktan sonra degistirilemez.



 wait() kullanimi

 	parametresiz wait()

  - kullanildigi is parcasi sonsuza kadar bekler 
  fakat diger is parcalari notify() veya notifyAll() cagirdiginda
  calismaya devam eder.

  	parametreli wait(long)

  - kullanildigi is parcasi verilen parametre kadar sure bekledikten sonra 
  calismaya devam edeer


 notify() kullanimi

 - Bir veya birden fazla is parcasi bekledigi durumda yanlizca tek is parcasini uyandirir
 digerleri beklemeye devam eder.
 Hangisinin uyandirilacagi secimi isletim sisteminin kendi kararina baglidir.


 notifyAll() kullaniimi

 - Tum bekleyen durumda olan is parcalarini uyandirir.
 Hangi sirada uyandirilacagi secimi isletim sisteminin kendi kararina baglidir.



~~~

Ornek 

~~~
Iki adet bekleyen is parcasi olusturalim.

Bir tane sinyal gonderelim yani notify() calistiralim. Ikinci is parcasinin calisip 
calismadigini gozlemleyelim.

notify() yerine notifyAll() yazarak programimizdaki tum is parcalarinin sonlandirildigini gorelim.
~~~

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencySignalMain.java




## Synchronized Anahtar kelimesi

~~~
Farkli is parcalarinin ayni anda girmesini istemedigimiz bolgeyi Synchronized anahtar kelimesi ile 
isaretlerdigimizde bir is parcaasi isini bitirmeden digerinin girmesini engellemis oluruz.

synchronized kullanildiginda birbirini bekleyecegi icin calisma suresinin daha uzun surmesinin
sizin icin problem olmayacagini kodumuza taahhut etmis oluruz.
~~~

### Sinifin Nesnesine Ait Metot
~~~
	  public synchronized void writerEverything(int value){
	      this.count += value;
	      System.out.println(this.count);
	  }
~~~



### Sinifin Nesnesine Ait Metot Icinde istenilen bir bolge
~~~
	  public void writerEverything(int value){
	      
	      this.count += value;
	      
	      synchronized (this){
	      	System.out.println(this.count);
	      }
	      
	  }
~~~



### Static Metot
~~~
	  public static  synchronized void writerEverything(int value){
	      this.count += value;
	      System.out.println(this.count)
	  }
~~~


### Static Metot Icinde istenilen bir bolge
~~~
	public classs User {

		..
		..

		  public static void writerEverything(int value){
		      this.count += value;

			synchronized(User.class){
		      System.out.println(this.count);
			}

		  }
	 }
~~~



##  ReentrantLock ile lock mekanizmalari
~~~

	ReentrantLock sınıfı ile is parcalarinin aynı anda istedigimiz kod bolumunde calismasi 

	Synchronized kelimesine benzer sekilde engelleyebiliriz.







 	ReentrantLock lock = new ReentrantLock();

 	...
 	...

 	lock.lock();

 			//sadece 1 is parcasi ayni anda calisabilecegi alan

 	lock.unlock();






    Sadece okuma veya sadece yazma islemini kontrol etmek isteyebiliriz.

     
      ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
     
      Lock readLock = readWriteLock.readLock();
     
      Lock writeLock = readWriteLock.writeLock();


       readLock.lock();

       				// sadece  1 is parcasi ayni anda burayi okuyabilir 

       readLock.unlock();




       writeLock.lock();

				// sadece  1 is parcasi ayni anda burayi yazabilir. 

       writeLock.unlock();




       Yukaridakilerin disinda recursive cagrilar yapildiginda birden fazla kez ayni lock islemini calistirmak
       veya bunlarla iliskili olan lock yapma islemimizin FairSync veya NoFairSync olmasinin 
       farklarini arastirabilirsiniz.



 	Yanlis kullanimlarda dead lock olarak adlandirilan durum olusmaktadir.
~~~



## Deadlock 
~~~

iki veya daha fazla is parcasinin calismak istedigi alandaki kilide ulasabilmesi

fakat birbirlerinin kilidi birakmasini beklemesi fakat kimsenin

orada calismak icin elindeki kilidi digerlerine birakamamasi olarak aciklanabilir.

~~~

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyDeadLockMain.java



## Deadlock tan nasil kacinilir.
~~~
	
	- Islemleri try finally bloguna alarak finally icinde kilidi ne olursa olsun acabiliriz.

	- Lock surelerini belirleyip otomatik sekilde tekrar actirabiliriz.

	- lock.tryLock() mekanizmasi ile eger kilitlenebilir durumda ise bu islemi yap gibi islemler yapabiliriz.

~~~






# ALTINCI BOLUM YARIN DEVAM EDELIM



##  Farkli is parcalari ayni kod parcasina ayni anda erisirlerse ne olur ? ( Race Conditions )

	Eger bir is parcasinin gerceklestirdigi islem sonucu diger is parcasinin baslangicta erismesi gereken giris bilgilerini etkiliyor ise

	ve bu is parcalarinin calisma sirasi sizin icin onemli ise, 

	farkli is parcalarinin sirasiyla calismasini saglamak icin yontemler gelistirmelisiniz.

	Cunku ayni anda ayni islem uzerinde farkli is parcalari calistiginda elde edilen sonuc buyuk olasilikla yanlis olacaktir.


	Genel olarak iki farkli durumda bu yontemi kendimizin gelistirmesi gerekir.

	-  veri oku - degistir - yaz

	- veri kontrol et sonra aksiyona gecip islem baslatildiginda




Ornek 

	Ortak banka hesabindan farkli kisiler para cekiyor. Ayni zaman diliminde islem yapmaya calistiklarinda nasil bir 
	durum ile karsilasiyoruz beraber inceleyelim.


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadRaceConditionReadWriteMain.java


Odev

En fazla iki is parcasi olusturacak sekilde, ayni uygulamayi bir is parcasi para cekiyor, diger is parcasi hesapta kalan son parayi kontrol edecek sekilde 
bir onceki uygulamadaki adimlari yeniden kodlama yapabiliriniz.



Ornek 


	Elimizdeki tek listeyi okuma yaparken ayni anda listeden eleman silersek listenin baslangictaki tutarliligi bozuldugu icin
	es zamanlilik problemleri yasariz.

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadSimultaneousProblemMain.java

		Ornekteki gibi hem okuma hem silme, birden fazla is parcasi calistirabilen veri yapisi ConcurrentHashMap ile cozume ulastik.
		Collections.synchronizedMap() de benzer bir yapitadadir. Fakat tek thread ile yapilan islemleri kabul etmektedir. Inceleyebilirsiniz.






Ornek 
 
Eger iki farkli is parcasi onceden belirlenmis bir durumu ayni anda kontrol ettikten sonra hareket ediyorlar ise 
burada problem ile karsilasabiliriz.


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadRaceConditionCheckAndActMain.java



Ornek 

	Elimizdeki 4 farkli sayiyi birer birer arttiran programi yazalim.
	Ilk adim olarak bizim icin kritik olan islemin tamamnin tek synchronized blogu olusturarak sonucu gorelim.
	Ikinci adim olarak birbirinden bagimsiz olan olaylari farkli synchronized bloklari olusturarak sonucu gorelim.


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadSyncDividedMultipleMain.java



## Thread Local Kullanimi
~~~
Istegidimiz objelerin sadece istedigimiz is parcasi tarafindan erisilebilir olmasini saglar. 
( Objects thread-safe)

Her olusturulan is parcasinin kendisine ait ThreadLocal map yapisi bulunur. 

Iki farkli is parcasi ayni ThreadLocal nesnesine eristigi zaman, 
aslinda kendisine ait olan ThreadLocla nesnesinin erisebildigi degerleri donus saglar.
~~~


Ornek 
~~~
Her is parcasi kendisi yazdigi veriyi okuyabiliyor fakat digerlerini etki edemiyor.
Calistirip gorelim.
~~~

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadLocalMain.java


Ornek 
~~~
Is parcalarinin kullandigi ThreadLocal objesininin tum verilerini silmeye calisalim.
Sadece kendi verilerinin silindigini gorelim.
~~~

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadLocalRemoveMain.java


Ornek
~~~

Farkli is parclari ile farkli ThreadLocal objelerini atama yaptiktan sonra olusturalim.

iki thread ve iki threadlocal objesi olusturmamiza ragmen her thread tarafinda okundugunda farkli 
objeleri gorecegiz. Bunun sebebi her cagrildiginda new Object() yeniden olusturuluyor.

ilk is parcasi iki farkli threadlocal objesi uzerinde yeni objeler uretmis oluyor.
ikinci is parcasi iki farkli threadlocal objesi uzerinde yeni objeler uretmis oluyor.

~~~

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadLocalInitialValueMain.java



Odev
~~~

InheritableThreadLocal var onu da sizler inceleyebilirsiniz
~~~






### Is parcalarinin calisma senaryolarina gore degiskenlerin erisilebilirlik durumlari

~~~
Herhangi bir thread calistiginda her thread kendi stack alanina erisebilir.

Calisan metotlarin icindeki tum yerel ( local ) degisken tipleri ve degerleri 
( boolean, byte, short, char, int, long, float, double ) her thread in kendi stack bolgesinde bulunur.

bu nedenle bir thread icerisinde olusturulan yerel degisken diger thread tarafindan erisilemez.

Hatta iki thread ayni kodu calistiriyor olsa bile 
her thread kendi stack bolgesinde ayni yerel degiskenleri tutup o anki degerini saklayacaktir.


HEAP alaninda, uygulamamiz calistiginda tum objeler 

( Boolean, Byte, Short ,Integer, Long, Float, Object )

olusturulur ve nerede olduguna bakilmaksizin (global, local ) saklanir.




KURAL : Tek runnable veya cok runnable farketmeksizin yerel degiskenler thread korumalidir.


Farkli is parcalari birbirinden bagimsiz olaylar ise herhangi bir problem yok
fakat farkli is parcalari ayni kaynagi kullaniyorsa kullandigimiz degikenlerin 

global degisken yani sinifa ait  veya 
yerel degisken yani sadece icinde bulundugu  metodun  kapsami boyunca hayattak kalan degisken 
olup olmadigina dikkat etmeliyiz !!!!!!!!!!!!!!!!

~~~



### Seperate

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadMemoryModelSeparateObjectsMain.java

~~~
T1 
  Global Object : Object@5eea0b9f 
  Local Object :  Object@19a5a312 
  Global Primitive Count : 1000000 
  Local Primitive  Count    : 1000000
T2 
  Global Object :  Object@5eea0b9f 
  Local Object :  bject@502dee32 
  Global Primitive Count : 1000000 
  Local Primitive  Count    : 1000000
~~~


~~~


================================ HEAP ======================================


	   runnable1 
	   												
	   													
	   							runnable2
   												

================================= HEAP ==================================


================================== Main Stack ==================================

		paramObject


		( runnable1 ref )		 ( runnable2 ref )
		 
		 globalCount=0				globalCount=0


======== Thread Stack 1 ======================= Thread Stack 2 ============
						|

i=0;										
						|				
localCount=0							
								i=0;
						|  		
						   		localCount=0

						|
============================================================================


~~~




### Shared


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadMemoryModelSharedObjectsMain.java

~~~
T1 
  Global Object : Object@57610202 
  Local Object :  Object@59a6f69e 
  Global Primitive Count : 1028102 
  Local Primitive  Count    : 1000000
T2 
  Global Object :  Object@57610202 
  Local Object :  Object@6b093046 
  Global Primitive Count : 1028102 
  Local Primitive  Count    : 1000000

~~~

~~~

================================ HEAP ======================================

							runnable1    										


================================= HEAP =====================================

================================== Main Stack ==============================


		paramObject



	!!!!	Two threads will use same globalCount object  !!!!
	!!!!	because only one runnable object              !!!!
			globalCount=0


======== Thread Stack 1 ===================================== Thread Stack 2 ============
							|

i=0;											i=0;
							|	 	
					


				!!!!	Two threads will use same localCount object  !!!!
				!!!!	because only one runnable object             !!!!
								
							 ( runnable1 ref )	
								
							localCount=0 	
						

							|
============================================================================



~~~












## Volatile Anahtar kelimesi

~~~
Volatile anahtar kelimesine sahip olan degiskenin 

Java derleyicisi ve Thread ler tarafindan on bellege okumak yerine

her zaman ana bellekten degiskenin son verisinin okunmasi saglanir.

Sinif veya metot ile kullanilmaz.

Farkli is parcalari ayni anda ayni degisken uzerinde calisabilmesini sagliyor.
~~~


Ornek

Elimizdeki bir degiskeni bir is parcasi ile degerini arttiralim, diger is parcasi ile degeri degistiginde
hemen ekrana yazalim. 

Ikinci is parcasi degerin degistigini anlayabilmek icin degeri aldiginda hafizadaki son deger olmalidir.
Bunu saglayan volatile anahtar kelimesidir.

Calistirdiktan sonra volatile anahtar kelimesini silip tekrar calistirarak hafizadan degilde cache ten 
okundugunu deneyimleyelim.



- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyThreadVolatileMain.java







## Atomic degiskenler
~~~

Atomik degiskenlerin isleyis mantigi Volatile anahtar kelimesi yardimiyla 
elimizdeki degiskenlerin istedigimiz obje tipinde tutulabilmesi ve 
obje seviyesinde islemler yapilabilmesini saglar.

Degerler Volatile anahtar kelimesi ile tutuldugu icin 
birden fazla thread calistirmak istenildiginde herhangi bir 
koruma yapmaya gerek yoktur.

Atomic kelimesi iceren siniflarindan olusturulan degiskenler
okuma ve yazma islemini atomik olarak yaptigi icin 
birden cok thread calistiginda tutarsizlik olmayacaktir.

~~~

### Atomic Boolean

~~~
boolean deger tutmak istedigimizde 

AtomicBoolean sinifindaki

volatile int value;

degiskeni yardimi ile bellekteki son bilginin alinabilmesini saglar.
~~~


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyAtomicBooleanMain.java


### Atomic Integer
~~~
int deger tutmak istedigimizde 

AtomicInteger sinifindaki

volatile int value;

degiskeni yardimi ile bellekteki son bilginin alinabilmesini saglar.
~~~

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyAtomicIntegerMain.java


### Atomic Long

~~~
long deger tutmak istedigimizde 

AtomicLong sinifindaki

volatile long value;

degiskeni yardimi ile bellekteki son bilginin alinabilmesini saglar.
~~~


- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyAtomicLongMain.java




### AtomicIntegerArray


~~~
AtomicInteger listesi tutmak istedigimizde bu sinifi kullanabiliriz.
~~~

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyAtomicIntegerArrayMain.java

### AtomicLongArray


~~~
AtomicLong listesi tutmak istedigimizde bu sinifi kullanabiliriz.
~~~

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyAtomicLongArrayMain.java



### Atomic Reference
~~~
Obje tipinde deger tutmak istedigimizde

AtomicReference sinifindaki

volatile V value;

degiskeni yardimi ile V degerine verilen obje tipinde bellekteki son bilginin alinabilmesini saglar.
~~~

- https://github.com/keramiozsoy/java101/blob/main/java101/src/main/java/examples/ConcurrencyAtomicReferenceMain.java






~~~



BURADAN ASAGISI EKSIKLER VAR


~~~




### Compare And Swap Concept ( CAS )
~~~
	Elimizde is parcalari tarafindan paylasilan bir alan olsun.
	Bu alan uzerinde ayni anda birden fazla is parcasi calisiyor olsun.

	Eger is parcalarindan bir tanesi bu alanin degerini degitirirse
	diger is parcalarinin basarisiz olmasini 
	herhangi bir lock mekanizmasi olmadan cozen
	konseptin ismidir.

	Eger paylasilan alan uzerinde islem yaptigimiz anda 
	o alanin mevcut ve guncellemek istedigimiz bilgiyi ayni anda tutabilirsek;

	- mevcut ve alanin orijinal  degeri ile karsilastiriyoruz.
	- eger yukaridaki adimda cevap esit ise mevcut deger guncellenen deger ile degisir.

	alan = 1 (orijinal)

	threadA calisti 1 degerini aldi 2 olarak guncellemek istiyor

	threadA guncelledi

	threadB calisti 1 degerini aldi 2 olarak guncellemek istiyor

	mevcut degere bakti 2 ( threadA degistirdi )


~~~

Thread paylasilan alan okundu orijinal degeri A, bunu guncelleyecek.

Thread paylasilan alan okundu orijinal degeri B, bunu guncelleyerek A yapti.

Ilk thread compare and swap yaptiginda hicbir sey degismemiz gibi oldugundan hata olusacak




### A-B-A Problem
~~~
	Compare And Swap Concept ( CAS ) veri yapisi dogru calismadigi durumda ortaya cikan probleme denir.
~~~



### Atomic Stamped Reference
~~~
Atomic Reference tipinden tek farki hem objeyi hem damga degerinin tutuyor
~~~




ConcurrencyAtomicStampedReferenceMain












		
		
		


	start() 		- hazir  						

	run() 			- calisiyor						

	islem suresince	- bloklanmis	

	wait() 			- bekleme modu  				

	sleep() 		- uyku modu 					

	stop()  		- artik yasamina devam etmiyor

	yield() 		- calistiktan sonra hazir hale geri donmesi 












