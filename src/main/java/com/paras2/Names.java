package com.paras2;

import java.util.Random;

public class Names 

{
	public String name() {
		Random r=new Random();
		
	String[] names = {
			    "AaravPatel",
			    "AnayaSharma",
			    "ArjunMehta",
			    "DiyaReddy",
			    "VivaanSingh",
			    "IshaChopra",
			    "AviKumar",
			    "KavyaDesai",
			    "VihaanGupta",
			    "MayaSharma",
			    "AyaanNair",
			    "SaanviVerma",
			    "ReyanshJoshi",
			    "AadhyaRao",
			    "IshaanBhat",
			    "NiaKapoor",
			    "RohanArora",
			    "KiaraMenon",
			    "AdvaitPatel",
			    "JiyaMishra",
			    "KabirGhosh",
			    "TaraSinha",
			    "RudraJain",
			    "PoojaYadav",
			    "AryanShukla",
			    "MeeraReddy",
			    "HrithikKumar",
			    "AnanyaIyer",
			    "ArnavGupta",
			    "NavyaRaj",
			    "SaiKhan",
			    "NishantGupta",
			    "TanviSingh",
			    "AaravSharma",
			    "KritiPawar",
			    "RishabhMohan",
			    "SwaraBhat",
			    "VivaanSingh",
			    "ShrutiSharma",
			    "AryaNair",
			    "AakashRao",
			    "MadhaviMehta",
			    "LakshyaChopra",
			    "NishaDesai",
			    "RaviJain",
			    "AartiMenon",
			    "SiddharthKapoor",
			    "KiranYadav",
			    "ShivaniKumar",
			    "AdityaGupta",
			    "DivyaShukla"
			};
	return names[r.nextInt(names.length)];

		
	}

	public static void main(String[] arg)
	{
		Names n=new Names();
		String s=n.name();
		System.out.println(s);
	}
	

}
