package org.codigorupestre.pagos.autoservicio;

import java.math.BigDecimal;

import org.codigorupestre.deposito.OperacionBancariaOxxo;

public class OperacionesBancariasAutoServicio {

	private OperacionBancariaOxxo operacionBancariaOxxo;
	
	public void depositar(String numeroTarjeta,BigDecimal monto) {
		this.operacionBancariaOxxo= new OperacionBancariaOxxo(numeroTarjeta,monto);
		this.operacionBancariaOxxo.depositar();
		
	}
	
	public void retirar(String numeroTarjeta,BigDecimal monto) {
		this.operacionBancariaOxxo= new OperacionBancariaOxxo(numeroTarjeta, monto);
		this.operacionBancariaOxxo.retirar();
	}
}
