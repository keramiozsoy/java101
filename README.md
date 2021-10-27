# java101


## Java Tarihçesi


Javanin yillara gore gelisim evrelerini goruntuleyebilecegimiz bir link ekleyecegim.


## Java Nedir ?


Java hem bir dil hem de bir ortam olarak dusunebilirsiniz.

 - Web uygulamalari
 
 - Masaustu uygulamalari

 - Oyunlar 
 
 - Android gibi temel gucu buyuk oranda java tarafindan gelen mobil uygulamalar gelisitirebilirsiniz.


## Java Dilinin Basarisi Nedir ?


 - Bellek problemlerini cozmesidir.

 - Nesneye yonelik progamalamaya uygun olmasi programlarimizi yazarken daha uygun gelistirmeler yapmamizi sagliyor.

 - Cok uzun yillardan beri sagladigi "bir kez yaz her yerde calistir" olanagini saglamasidir.


## Cop Toplayici Nedir?


- Programlarimizin calisma suresi boyunca ortaya cikan ve sonradan kullanilmayan gereksiz nesneleri bulur ve onlari temizler.  

- Mekanizmanin adi cop toplayici ( garbage collector ) olarak bilinir. 

- C++ gibi dillerde bellekte yer kaplayan bilgilerin temizlenmesi sorumlulugu, java dilinde kodlama yapan kisiye ait degildir.

- Cunku gereksiz ve kullanilmayan bellek alanlarini cop toplayici (garbage collector) mekanizmasi ile temizlemesidir.

- Cop toplayici temizleme islemleri yaparken kullanilan java versiyonlara gore yillar icinde degiserek farkli yontemler ile isini halleder.
	* referans sayma yontemi
	* kopyalama yontemi
	* isaretle ve supur yontemi
	* artan(sira) yontemi
	* vb.



## Java Nasil Calisir?

 Bit nedir?
  0 veya 1 ile bilginin bellekte olmasi veya olamamasi durumunu karsiyalan terimdir.

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

		- JVM isletim sistemi ile java kodumuz arasinda kopru gorevindedir. Bu nedenle yazilan kod herhangi bir degisiklik yapilmadan bir kere yazip her yerde calistirabiliriz.

   JRE - Java Calistirma Ortami ( Java Runtime Environment )

    	- Java uygulamalarinin calismasi icin gereken kutuphanleri barindirir.

	JDK - Java Gelistirebilme Ortami ( Java Development Environment )

    	- Yazilimcilarin programlama yapabilmesi ve calistirabilmesine olanak saglar (JRE icindedir.)

    	JDK = JRE + JVM





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


	EKSIK
	EKSIK
	EKSIK
	EKSIK
	EKSIK
	EKSIK

STACK VE HEAP

Java Memory Management isimli linkedin egitiminin aynisi zaten anlatilmis oradan kopyala




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



### Referans Veri Tipleri


Yukaridaki Ilkel veri tiplerinin gelistirilmis sinif mantigina dayanan halleri vardir.
Ayni degerleri siniflar yardimi ile olusturabiliyoruz.

Character
Long
Integer
Short
Byte
Double
Float	
Boolean

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



## Kontrol İfadeleri

## Fonksiyonlar

## Diziler