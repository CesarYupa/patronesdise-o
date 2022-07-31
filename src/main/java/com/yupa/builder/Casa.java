package com.yupa.builder;

public class Casa {
	
	private final String dueno;
	private final boolean pared;
	private final boolean ventana;
	private final int habitacion;
	private final boolean jardin;
	
	private Casa(CasaBuilder builder) {
		this.dueno = builder.dueno;
		this.pared = builder.pared;
		this.ventana = builder.ventana;
		this.habitacion = builder.habitacion;
		this.jardin = builder.jardin;
	}
	
	public String getDueno() {
		return dueno;
	}

	public boolean isPared() {
		return pared;
	}

	public boolean isVentana() {
		return ventana;
	}

	public int getHabitacion() {
		return habitacion;
	}

	public boolean isJardin() {
		return jardin;
	}
	
	
	@Override
	public String toString() {
		return "Casa [dueno=" + dueno + ", pared=" + pared + ", ventana=" + ventana + ", habitacion=" + habitacion
				+ ", jardin=" + jardin + "]";
	}

	public static class CasaBuilder{
		
		private String dueno;
		private boolean pared;
		private boolean ventana;
		private int habitacion;
		private boolean jardin;
		
		public CasaBuilder(String dueno) {
			this.dueno = dueno;
		}
		
		public CasaBuilder pared(boolean pared) {
			this.pared = pared;
			return this;
		}
		
		public CasaBuilder ventana(boolean venana) {
			this.ventana = venana;
			return this;
		}
		
		public CasaBuilder habitancion(int habitacion) {
			this.habitacion = habitacion;
			return this;
		}
		
		public CasaBuilder jarin(boolean jardin) {
			this.jardin = jardin;
			return this;
		}
		
		public Casa buid() {
			return new Casa(this);
		}
	}

}
