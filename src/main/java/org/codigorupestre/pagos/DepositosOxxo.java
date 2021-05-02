package org.codigorupestre.pagos;

import java.math.BigDecimal;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.codigorupestre.pagos.autoservicio.OperacionesBancariasAutoServicio;

public class DepositosOxxo {

	private static final Logger LOG = Logger.getLogger(DepositosOxxo.class.getName());

	public static void main(String[] args) {

		String[] options = { "deposito", "retiro" };
		ImageIcon icon = new ImageIcon("src/main/resources/images/tarjeta-saldazo.png");

		String operacion = (String) JOptionPane.showInputDialog(null, "Que operacion va a realizar?",
				"Operaciones bancarias", JOptionPane.QUESTION_MESSAGE, icon, options, null);
		String numeroTarjeta = JOptionPane.showInputDialog("Ingresa numero de tarjeta");
		BigDecimal monto = new BigDecimal(JOptionPane.showInputDialog("Ingresa el monto"));
		
		OperacionesBancariasAutoServicio autoServicio;
		
		switch(operacion) {
		case "deposito":
			autoServicio=new OperacionesBancariasAutoServicio();
			autoServicio.depositar(numeroTarjeta, monto);
			break;
		case "retiro":
			autoServicio=new OperacionesBancariasAutoServicio();
			autoServicio.retirar(numeroTarjeta, monto);
			break;
		}
		
		

	}

}
