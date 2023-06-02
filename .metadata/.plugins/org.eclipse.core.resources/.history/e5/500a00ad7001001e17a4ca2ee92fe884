package Convertidor;

public class ConvertTemperatura {
	private double TempIn;
	private double TempOut;
	
	public ConvertTemperatura() {
		
	}
	public void setTempIn(double tempIn) {
		TempIn = tempIn;
	}
	public double getTempIn() {
		return TempIn;
	}
	public void setTempOut(double tempOut) {
		TempOut = tempOut;
	}
	public double getTempOut() {
		return TempOut;
	}
	
	public double conCelFar(double tempIn) {
		this.TempIn=tempIn;
		this.TempOut=this.TempIn*1.8+32;
		return TempOut;	
	}
	public double conCelKel(double tempIn) {
		this.TempIn=tempIn;
		this.TempOut=this.TempIn+273.15;
		return TempOut;	
	}
	public double conFarCel(double tempIn) {
		this.TempIn=tempIn;
		this.TempOut=(this.TempIn-32)/1.8;
		return TempOut;	
	}
	public double conFarKel(double tempIn) {
		this.TempIn=tempIn;
		this.TempOut=((this.TempIn-32)/1.8)+273.15;
		return TempOut;	
	}
	public double conKelCel(double tempIn) {
		this.TempIn=tempIn;
		this.TempOut=this.TempIn-273.15;
		return TempOut;	
	}
	public double conKelFar(double tempIn) {
		this.TempIn=tempIn;
		this.TempOut=(this.TempIn-273.15)*1.8+32;
		return TempOut;	
	}
	
}
