package com.oto.despachante.utils;

public class ValorExtensoUtils {

	public static String extenso(Double valorTotal) {
		PorExtenso pe = new PorExtenso();
		String str = "";
		if (valorTotal != null) {
			str = valorTotal.toString();
			String[] vt = str.split("\\.");
			if (vt[1].length() < 2) {
				str = str + "0";
			}
		}
		return pe.getExtenso(str);
	}

}
