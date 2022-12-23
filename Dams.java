package com.xworkx.collectionApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dams {

	public static void main(String[] args) {

		Collection<String> karnatakaDams = new ArrayList<String>();

		karnatakaDams.add("Almatti");
		karnatakaDams.add("Bhadra");
		karnatakaDams.add("BasavaSagara");
		karnatakaDams.add("Harangi");
		karnatakaDams.add("HemavatiRiver");
		karnatakaDams.add("Kabini");
		karnatakaDams.add("KabiniRiver");
		karnatakaDams.add("Kadra");
		karnatakaDams.add("Kodasalli");
		karnatakaDams.add("KrishnaRajaSagara");
		karnatakaDams.add("Lakkavalli");
		karnatakaDams.add("Linganamakki");
		karnatakaDams.add("RajaLakhamagouda");
		karnatakaDams.add("Supa");
		karnatakaDams.add("SuvarnavathiReservoir");
		karnatakaDams.add("ThippagondanahalliReservoir");
		karnatakaDams.add("Tungabhadra");
		karnatakaDams.add("TungabhadraRiver");
		karnatakaDams.add("VaniVilasaSagara");

		System.out.println("Nos of dams in karnataka" + karnatakaDams.size());
		System.out.println("===List of Dams in Karnataka====");
		Iterator<String> karDams = karnatakaDams.iterator();
		while (karDams.hasNext()) {
			System.out.println(karDams.next());
		}

		Collection<String> keralaDams = new ArrayList<String>();

		keralaDams.add("Mattupetty–Idukki");
		keralaDams.add("BanasuraSagar-Wayanad");
		keralaDams.add("Neyyar-Trivandrum");
		keralaDams.add("Bhoothathankettu-Ernakulam");
		keralaDams.add("Pothundi-Palakkad");
		keralaDams.add("Mullaperiyar-Idukki");
		keralaDams.add("Peruvaaripallam");
		keralaDams.add("Vazhani");
		keralaDams.add("Pathanamthitta");
		keralaDams.add("Peppara");
		keralaDams.add("Thenmala");
		System.out.println("=========================================");
		System.out.println("Nos of dams in kerala" + keralaDams.size());
		System.out.println("===List of Dams in Kerala===");

		Iterator<String> klDams = keralaDams.iterator();
		while (klDams.hasNext()) {
			System.out.println(klDams.next());
		}

		Collection<String> tnDams = new ArrayList<String>();
		tnDams.add("Mettur");
		tnDams.add("BhavaniSagar");
		tnDams.add("Amaravathi");
		tnDams.add("Krishnagiri");
		tnDams.add("Sathanur");
		tnDams.add("Mullaperiyar");
		tnDams.add("Vaigai");
		tnDams.add("Manimuthar");
		tnDams.add("Papanasam");
		tnDams.add("ParambikulamAliyarProject");

		System.out.println("=========================================");
		System.out.println("Nos of dams in TamilNadu" + tnDams.size());
		System.out.println("===List of Dams in TamilNadu===");

		Iterator<String> tamilNaduDams = tnDams.iterator();
		while (tamilNaduDams.hasNext()) {

			System.out.println(tamilNaduDams.next());

		}

		Collection<String> apDams = new ArrayList<String>();
		apDams.add("NagarjunaSagar");
		apDams.add("Srisailam");
		apDams.add("PolavaramProject");
		apDams.add("Somasila");
		apDams.add("Pulichinthala");
		apDams.add("MidPennar");
		apDams.add("VeligalluReservoir");
		apDams.add("Rajolibanda");
		apDams.add("GundlakammaReservoirProject");
		apDams.add("DowleswaramBarrage");
		apDams.add("Mylavaram");
		apDams.add("ChitravathiBalancingReservoir");
		apDams.add("VykuntapuramBarrage");
		apDams.add("PABR,PennaAhobilam");
		apDams.add("VelugoduBalancingReservoir");
		apDams.add("BrahmamsagarReservoir");
		apDams.add("Kalyani");
		apDams.add("GandikotaReservoir");
		apDams.add("Jalaput");
		apDams.add("NallamalasagarReservoir");

		System.out.println("=========================================");
		System.out.println("Nos of dams in AndraPradesh" + apDams.size());
		System.out.println("===List of Dams in AndraPradesh===");

		Iterator<String> andraDams = apDams.iterator();
		while (andraDams.hasNext()) {
			System.out.println(andraDams.next());
		}

		Collection<String> mahaDams = new ArrayList<String>();
		mahaDams.add("Nira");
		mahaDams.add("Gargoti");
		mahaDams.add("Dhupgarh");
		mahaDams.add("Warna");
		mahaDams.add("Walwyn");
		mahaDams.add("Talaipalli");
		mahaDams.add("Panshet");
		mahaDams.add("Koyna");
		mahaDams.add("Dhom");
		mahaDams.add("Bhivpuri");

		System.out.println("=========================================");
		System.out.println("Nos of dams in Maharashta" + mahaDams.size());
		System.out.println("===List of Dams in Maharashtra===");

		Iterator<String> maharstraDams = mahaDams.iterator();
		while (maharstraDams.hasNext()) {
			System.out.println(maharstraDams.next());
		}

		Collection<String> odishaDams = new ArrayList<String>();
		odishaDams.add("Magara");
		odishaDams.add("Kalakala");
		odishaDams.add("Jhumuka");
		odishaDams.add("Harabhangi");
		odishaDams.add("Balaskumpa");
		odishaDams.add("Baghua");
		odishaDams.add("Baghua");
		odishaDams.add("Baghjharan");
		odishaDams.add("Baghalati");
		odishaDams.add("Badjore");
		odishaDams.add("Badanalla");
		odishaDams.add("Badabandha");
		odishaDams.add("Arikul");
		odishaDams.add("Aradei");
		odishaDams.add("Alubani	");

		System.out.println("=========================================");
		System.out.println("Nosofdamsinodisha" + odishaDams.size());
		System.out.println("===List of Dams in odisha===");

		Iterator<String> odDams = odishaDams.iterator();
		while (odDams.hasNext()) {
			System.out.println(odDams.next());
		}

		Collection<String> gujarathDams = new ArrayList<String>();
		gujarathDams.add("Ajwa");
		gujarathDams.add("Bhadbhut");
		gujarathDams.add("Dantiwada");
		gujarathDams.add("Dharoi");
		gujarathDams.add("Dholi");
		gujarathDams.add("Dholidhaja");
		gujarathDams.add("Kadana");
		gujarathDams.add("KalpasarProject");
		gujarathDams.add("Kamleshwar");
		gujarathDams.add("Khodiyar");
		gujarathDams.add("Mazumreservoir");
		gujarathDams.add("Mitti");
		gujarathDams.add("Nayka");
		gujarathDams.add("Panam");
		gujarathDams.add("SardarSarovar");
		gujarathDams.add("Sukhi");
		gujarathDams.add("Ukai");
		gujarathDams.add("Willingdon");

		System.out.println("=========================================");
		System.out.println("NosofdamsinGujarath" + gujarathDams.size());
		System.out.println("===List of Dams in Gujarath===");

		Iterator<String> gDams = gujarathDams.iterator();
		while (gDams.hasNext()) {
			String string = (String) gDams.next();
			System.out.println(string);
		}

		Collection<String> mpDams = new ArrayList<String>();
		mpDams.add("Adampura");
		mpDams.add("Adner");
		mpDams.add("AgarAgari");
		mpDams.add("BhamoriyaNala");
		mpDams.add("Bhangra");
		mpDams.add("Bhawanipur");
		mpDams.add("Birul");
		mpDams.add("Chachariyapati");
		mpDams.add("Chachundra");
		mpDams.add("Chandapatha");
		mpDams.add("Chanderi");
		mpDams.add("Datia");
		mpDams.add("Dhanmarahi");
		mpDams.add("Dhapora");
		mpDams.add("GandhiSagar");
		mpDams.add("Gawala");
		mpDams.add("Ghoghatpur");
		mpDams.add("HanumanBanda");
		mpDams.add("IndiraSagar(NHDC)");
		mpDams.add("Jabera");
		mpDams.add("Kaketo");
		mpDams.add("Kalyanpura");
		mpDams.add("Latar");
		System.out.println("=========================================");
		System.out.println("Nos of dams in MP" + mpDams.size());
		System.out.println("===List of Dams in MP===");

		Iterator<String> mp = mpDams.iterator();
		while (mp.hasNext()) {
			String string = (String) mp.next();
			System.out.println(string);
		}

		Collection<String> chattisghar = new ArrayList<String>();
		chattisghar.add("Tandula");
		chattisghar.add("Dudhawa");
		chattisghar.add("Gangrel");
		chattisghar.add("KherkattaReservoir");
		chattisghar.add("MurrumSilli");
		chattisghar.add("Sondur");
		chattisghar.add("HasdeoBango");
		chattisghar.add("Agariya");
		chattisghar.add("Ballar");
		chattisghar.add("ChhotaPalgi");
		chattisghar.add("Chilputi");
		chattisghar.add("Dhara");
		chattisghar.add("GagnaiDamFulwari");
		chattisghar.add("Ghumarapadar");
		chattisghar.add("Jhingo");

		System.out.println("=========================================");
		System.out.println("Nos of dams in Chattisghar" + chattisghar.size());
		System.out.println("===ListofDamsinChattisghar===");

		Iterator<String> chDams = chattisghar.iterator();
		while (chDams.hasNext()) {
			String string = (String) chDams.next();
			System.out.println(string);
		}

		Collection<String> jarkhand = new ArrayList<String>();
		jarkhand.add("Amanat");
		jarkhand.add("Baranadi");
		jarkhand.add("Barhi");
		jarkhand.add("Chandil");
		jarkhand.add("Danro");
		jarkhand.add("Garhi");
		jarkhand.add("Hatia");
		jarkhand.add("Jaipur");
		jarkhand.add("Kesho");
		jarkhand.add("Lotia");

		System.out.println("=========================================");
		System.out.println("Nos of dams in Jharkand" + jarkhand.size());
		System.out.println("===ListofDamsinJharkand===");

		Iterator<String> jarDams1 = jarkhand.iterator();
		while (jarDams1.hasNext()) {
			String string = jarDams1.next();
			System.out.println(string);

		}

		Collection<String> wb = new ArrayList<String>();
		wb.add("Bakreshwar");
		wb.add("Bandhu");
		wb.add("BaraMandira");
		wb.add("BarabhumGolamarajore");
		wb.add("HinglowIrrigationScheme");
		wb.add("Kanjan");
		wb.add("Lipania");
		wb.add("Moutorejore");
		wb.add("NachanIrri.Scheme");
		wb.add("SaharajoreIrri.Scheme");
		wb.add("Teesta-IVLower");
		wb.add("TurgaIrri.Scheme");
		wb.add("Upper:PPSP");

		System.out.println("=========================================");
		System.out.println("Nos of dams in WestBengal" + wb.size());
		System.out.println("===ListofDamsinWestBengal===");

		Iterator<String> wbDams = wb.iterator();
		while (wbDams.hasNext()) {
			String string = (String) wbDams.next();
			System.out.println(string);
		}

		Collection<String> up = new ArrayList<String>();
		up.add("Ajan");
		up.add("Amrity");
		up.add("Badua");
		up.add("Barnar");
		up.add("Baskund");
		up.add("Belharna");
		up.add("Chandan");
		up.add("Durgawati");
		up.add("Gaighat");
		up.add("Jalkund");
		up.add("Job	");
		up.add("KailashGhati");
		up.add("KhargpurLake");
		up.add("Kohira");
		up.add("Kolmahadeo");
		up.add("Morwy");
		up.add("Nagi");
		up.add("Nakti");

		System.out.println("=========================================");
		System.out.println("Nos of dams in UttarPradesh" + up.size());
		System.out.println("===ListofDamsinUttarpradesh===");

		Iterator<String> upDams = up.iterator();
		while (upDams.hasNext()) {
			String string = upDams.next();
			System.out.println(string);
		}

		Collection<String> bihar = new ArrayList<String>();
		bihar.add("Adwa");
		bihar.add("Afzalgarh");
		bihar.add("Ahraura");
		bihar.add("Arjun");
		bihar.add("Aunjhar");
		bihar.add("Barwa");
		bihar.add("Bhainsora");
		bihar.add("Ganeshpur");
		bihar.add("Gointha");
		bihar.add("Kachnoda");
		bihar.add("Khairman");
		bihar.add("LowerKhajuri");

		System.out.println("=========================================");
		System.out.println("Nos of dams in Bihar" + bihar.size());
		System.out.println("===ListofDamsinBihar===");

		Iterator<String> biharDams = bihar.iterator();
		while (biharDams.hasNext()) {
			String string = (String) biharDams.next();
			System.out.println(string);
		}

		Collection<String> haryana = new ArrayList<String>();
		haryana.add("Anangpur");
		haryana.add("HathniKundBarrage");
		haryana.add("Kaushalya");
		haryana.add("Masanibarrage");
		haryana.add("Ottubarrage");
		haryana.add("Pallabarrage");
		haryana.add("Pathralabarrage");
		haryana.add("TajewalaBarrage");
		haryana.add("saspsas");

		System.out.println("=========================================");
		System.out.println("Nos of dams in harayana" + haryana.size());
		System.out.println("===ListofDamsinHaryana===");

		Iterator<String> haryanaDams = haryana.iterator();
		while (haryanaDams.hasNext()) {
			String string = (String) haryanaDams.next();
			System.out.println(string);
		}

		Collection<String> uttarkand = new ArrayList<String>();
		uttarkand.add("Baigul");
		uttarkand.add("Baur");
		uttarkand.add("Bhimtal");
		uttarkand.add("Dhauliganga");
		uttarkand.add("Dhora");
		uttarkand.add("Lakhwar");
		uttarkand.add("Koteshwar");
		uttarkand.add("Maneri");

		System.out.println("=========================================");
		System.out.println("Nos of dams inUttarKhand" + uttarkand.size());
		System.out.println("===List of Dams in UttarKhand===");

		Iterator<String> uttIteratorDams = uttarkand.iterator();
		while (uttIteratorDams.hasNext()) {
			String string = uttIteratorDams.next();
			System.out.println(string);
		}

		Collection<String> himachalPradesh = new ArrayList<String>();
		himachalPradesh.add("BairaSiul");
		himachalPradesh.add("ChameraI");
		himachalPradesh.add("Karchham-Wangtoo");
		himachalPradesh.add("Kol");
		himachalPradesh.add("MalanaI");
		himachalPradesh.add("NathpaJhakri(Sjvnl)");
		himachalPradesh.add("ParbatiII");

		System.out.println("=========================================");
		System.out.println("Nos of dams in HimachalPradesh" + himachalPradesh.size());
		System.out.println("===List of Dams in HimachalPradesh===");

		Iterator<String> himachalDams = himachalPradesh.iterator();
		while (himachalDams.hasNext()) {
			String string = (String) himachalDams.next();
			System.out.println(string);
		}

		Collection<String> jk = new ArrayList<String>();
		jk.add("Baglihar");
		jk.add("Dulhasti");
		jk.add("Kishenganga");
		jk.add("NimooBazgo");
		jk.add("NiuKarewaStorageYusmarg	");
		jk.add("PakalDul");
		jk.add("Salal(RockfillAndConcrete)");
		jk.add("SewaStII");
		jk.add("Uri-II");
		jk.add("Mim");

		System.out.println("=========================================");
		System.out.println("Nos of dams in Jammu and Kashmir" + himachalPradesh.size());
		System.out.println("===List of Dams in Jammu and KAshmir===");

		Iterator<String> jkDams = jk.iterator();
		while (jkDams.hasNext()) {
			String string = (String) jkDams.next();
			System.out.println(string);
		}

		Collection<String> indianDams = new ArrayList<String>();
		indianDams.addAll(karnatakaDams);
		indianDams.addAll(keralaDams);
		indianDams.addAll(gujarathDams);
		indianDams.addAll(tnDams);
		indianDams.addAll(apDams);
		indianDams.addAll(uttarkand);
		indianDams.addAll(mahaDams);
		indianDams.addAll(mpDams);
		indianDams.addAll(odishaDams);
		indianDams.addAll(chattisghar);
		indianDams.addAll(jarkhand);
		indianDams.addAll(wb);
		indianDams.addAll(up);
		indianDams.addAll(bihar);
		indianDams.addAll(haryana);
		indianDams.addAll(himachalPradesh);
		indianDams.addAll(jk);
		System.out.println("=========================================");
		System.out.println("No of Dams in India " + indianDams.size());

		Iterator<String> starts = indianDams.iterator();
		System.out.println(" ");
		System.out.println("List of Dams name Start with T");
		while (starts.hasNext()) {
			String string = (String) starts.next();
			if (string.startsWith("T")) {
				System.out.println(string);
			}
		}

		Iterator<String> ends = indianDams.iterator();
		System.out.println(" ");
		System.out.println("List of Dams name ends with ra");
		while (ends.hasNext()) {
			String string = (String) ends.next();
			if (string.endsWith("ra")) {
				System.out.println(string);
			}
		}

		Iterator<String> leng = indianDams.iterator();
		System.out.println(" ");
		System.out.println("List of Dams name having more than 15 character");
		while (leng.hasNext()) {
			String string = (String) leng.next();
			if (string.length() > 15) {
				System.out.println(string);
			}

		}
		
		Iterator<String> upper = indianDams.iterator();
		System.out.println(" ");
		System.out.println("After converting to upper case");
		while (upper.hasNext()) {
			String string = (String) upper.next();
			System.out.println(string.toUpperCase());
		}
		
		Iterator<String> lower = indianDams.iterator();
		System.out.println(" ");
		System.out.println("After converting to lower case");
		while (lower.hasNext()) {
			String string = (String) lower.next();
			System.out.println(string.toLowerCase());
		}
		
		Iterator<String> remv = indianDams.iterator();
		System.out.println(" ");
		System.out.println("List of palindrome dams");
	
		while (remv.hasNext()) {
			String cc = (String) remv.next();
			String pal=cc.toLowerCase();
			StringBuffer buffer = new StringBuffer(pal);
			buffer.reverse();
			String all=buffer.toString();
			if(all.equals(pal))
			{
				System.out.println(buffer);

			}
		}
		
		Iterator<String> del= indianDams.iterator();
		
		while (del.hasNext()) {
			String string = (String) del.next();
			if(string.contains("p")) {
				del.remove();
				

			}
		}
		
		System.out.println(" ");
		System.out.println("Removing names contain p");
		Iterator<String> indDams= indianDams.iterator();
		while (indDams.hasNext()) {
			String string = (String) indDams.next();
			System.out.println(string);
			
		}
		
		
		
		
	}

}
