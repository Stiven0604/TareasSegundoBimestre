package Paquete1;

import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Main {

    static CuentaCorriente cuentaco[] = new CuentaCorriente[5];
    static TransaccionValidacionPIN pin[] = new TransaccionValidacionPIN[5];
    static Cajadeahorro caja[] = new Cajadeahorro[5];
    static TransaccionRetiro transR = new TransaccionRetiro(458721687, 200, "Cuenta Corriente", "Steven Jimenez");
    static TransaccionConsulta consulta = new TransaccionConsulta("consulta", 142, "", "");
    static TransaccionTransferencia transferencia = new TransaccionTransferencia(200.0, 457, 15, "", "");
    static String m = "";
    static String[] opc2 = {"Cuenta Corriente", "Cuenta de Ahorros", "Concelar"};
    static int n, nv, c, j, t,cp;
    static double sali, mf;
    static int id = (int) (Math.random() * 1000 + 15);
    static Date fecha = new Date();

    public static void main(String[] args) {
        boolean cv = false;
        if (validarUsuario(cv) == true) {
            if (n == 0) {
                if (validarPinc(cv) == true && n > 0) {
                    Cajero();
                } else {

                    JOptionPane.showMessageDialog(null, "DEMASIADOS INTENTOS \n CUENTA BLOQUEADA");
                }
            } else {
                if (n == 1) {
                    if (validarPinh(cv) == true && n > 0) {
                        Cajero();
                    } else {

                        JOptionPane.showMessageDialog(null, "DEMASIADOS INTENTOS \n CUENTA BLOQUEADA");
                    }

                }
            }
        }
    }

    public static void Cajero() {
        String[] opc = {"Consultar Saldo", "Deposito", "Retiro", "Transferencia", "Salir"};
        int s = 1;
        while (s == 1) {
            m = "";

            int op = JOptionPane.showOptionDialog(null, "Elegir la opcion que desee realizar", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opc, opc[0]);
            if (op == 0) {
                if (c == 0) {
                    ConsultaCorriente();
                } else {
                    if (c == 1) {
                        ConsultaAhorros();
                    }
                }

            } else {
                if (op == 1) {

                    if (c == 0) {
                        DepositoCorriente();
                        if (cp==1) {
                            ComprobanteD();
                        }
                    } else {
                        if (c == 1) {
                            DepositoAhorro();
                            if (cp==1) {
                                ComprobanteD();
                            }
                            
                        }
                    }

                } else {
                    if (op == 2) {

                        if (c == 0) {
                            RetiroCorriente();
                            if (cp==1) {
                                ComprobanteR();
                            }
                            
                        } else {
                            if (c == 1) {
                                RetiroAhorro();
                                if (cp==1) {
                                    ComprobanteR();
                                }
                                
                            }
                        }
                    } else {
                        if (op == 3) {
                            transferencia();
                            if (cp==1) {
                                ComprobanteT();
                            }
                        } else {
                            if (op == 4) {
                                s = 0;
                                JOptionPane.showMessageDialog(null, "Muchas gracias");
                            }
                        }
                    }
                }
            }
        }
    }

    public static void DepositoCorriente() {
        int i = 0;
        while (i == 0) {
            double r;
            try {
                r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea depositar", "DEPOSITO", JOptionPane.QUESTION_MESSAGE));
                if (r > 9 && r <= 1000) {
                    mf=r;
                    transR.getMonto();
                    cuentaco[nv].credito(r);
                    cp=1;
                    JOptionPane.showMessageDialog(null, "DEPOSITO EXITOSO");
                    i = 1;
                } else {
                    if (r > 1000) {
                        JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN DEPOSITOS HASTA 1000$ ", "DEPOSITO FALLIDO", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (r < 10) {
                            JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN DEPOSITOS DE 10$ HASTA 1000$ ", "DEPOSITO FALLIDO", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                }
            } catch (NullPointerException ex) {
                i = 1;
                n = 2;
            }
        }
    }

    public static void DepositoAhorro() {
        int i = 0;
        while (i == 0) {
            double r;
            try {
                r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea depositar", "DEPOSITO", JOptionPane.QUESTION_MESSAGE));
                if (r > 9 && r <= 1000) {
                    mf=r;
                    transR.getMonto();
                    caja[nv].credito(r);
                    cp=1;
                    JOptionPane.showMessageDialog(null, "DEPOSITO EXITOSO");
                    i = 1;
                } else {
                    if (r > 1000) {
                        JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN DEPOSITOS HASTA 1000$ ", "DEPOSITO FALLIDO", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (r < 10) {
                            JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN DEPOSITOS DE 10$ HASTA 1000$ ", "DEPOSITO FALLIDO", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                }
            } catch (NullPointerException ex) {
                i = 1;
                n = 2;
            }
        }
    }

    public static void RetiroCorriente() {
        int jk = 0;
        while (jk == 0) {
            double r;
            try {
                r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea retirar", "RETIRO", JOptionPane.QUESTION_MESSAGE));
                if (r >= 5 && r <= cuentaco[nv].getSaldo()) {
                    sali=cuentaco[nv].getSaldo();
                    transR.extraccion(r);
                    cuentaco[nv].debito(r);
                    mf=r;
                    JOptionPane.showMessageDialog(null, "RETIRO EXITOSO");
                    jk = 1;
                    cp=1;
                } else {
                    if (r > cuentaco[nv].getSaldo()) {
                        JOptionPane.showMessageDialog(null, "FONDOS INSUFICIENTES", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (r < 5) {
                            JOptionPane.showMessageDialog(null, "SOLO SE PERMITE RETIROS DE DE 5$ HACIA DELANTE", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            } catch (NullPointerException ex) {
                jk = 1;
                n = 2;
            }
        }

    }

    public static void RetiroAhorro() {
        int jk = 0;
        while (jk == 0) {
            double r;
            try {
                r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea retirar", "RETIRO", JOptionPane.QUESTION_MESSAGE));
                if (r >= 5 && r <= caja[nv].getSaldo()) {
                    sali=caja[nv].getSaldo();
                    transR.extraccion(r);
                    caja[nv].debito(r);
                    mf=r;
                    JOptionPane.showMessageDialog(null, "RETIRO EXITOSO");
                    jk = 1;
                    cp=1;
                    
                } else {
                    if (r > caja[nv].getSaldo()) {
                        JOptionPane.showMessageDialog(null, "FONDOS INSUFICIENTES", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (r < 5) {
                            JOptionPane.showMessageDialog(null, "SOLO SE PERMITE RETIROS DE DE 5$ HACIA DELANTE", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            } catch (NullPointerException ex) {
                jk = 1;
                n = 2;
            }
        }

    }

    public static String fechaA() {
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }

    public static boolean validarUsuario(boolean ce) {

//        Cuentas Corrientes
        cuentaco[0] = new CuentaCorriente(480125747, 200, "Cuenta Corriente", "Cliente 1");
        cuentaco[1] = new CuentaCorriente(487531495, 300, "Cuenta Corriente", "Cliente 2");
        cuentaco[2] = new CuentaCorriente(487895426, 300, "Cuenta Corriente", "Cliente 3");
        cuentaco[3] = new CuentaCorriente(481208752, 300, "Cuenta Corriente", "Cliente 4");
        cuentaco[4] = new CuentaCorriente(487801325, 300, "Cuenta Corriente", "Cliente 5");

//        Ahorros
        caja[0] = new Cajadeahorro(1124756321, 300, "Cuenta de Ahorros", "Cliente 1");
        caja[1] = new Cajadeahorro(1157512894, 500, "Cuenta de Ahorros", "Cliente 2");
        caja[2] = new Cajadeahorro(1124756328, 400.50, "Cuenta de Ahorros", "Cliente 3");
        caja[3] = new Cajadeahorro(1104220632, 542.1, "Cuenta de Ahorros", "Cliente 4");
        caja[4] = new Cajadeahorro(1124778263, 300, "Cuenta de Ahorros", "Cliente 5");

        int b, h = 0;
        while (h == 0) {
            int op2 = JOptionPane.showOptionDialog(null, "Elegir la opcion que desee realizar", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opc2, opc2[0]);
            c = op2;
            h = op2;
            b = op2;
            while (b >= 0) {
                try {
                    if (op2 == 0) {
                        int nc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta", "NUMERO DE CUENTA", JOptionPane.QUESTION_MESSAGE));
                        for (int i = 0; i <= 4; i++) {
                            if (nc == cuentaco[i].getNumero_cuenta()) {
                                nv = i;
                                JOptionPane.showMessageDialog(null, "CUENTA ENCONTRADA");
                                sali=cuentaco[i].getSaldo();
                                i = 10;
                                b = -1;
                                h = 1;
                                ce = true;
                            } else {
                                ce = false;
                            }
                        }
                        if (ce == false) {
                            JOptionPane.showMessageDialog(null, "CUENTA NO ENCONTRADA");
                        }
                    } else {
                        if (op2 == 1) {
                            int nc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de cuenta", "NUMERO DE CUENTA", JOptionPane.QUESTION_MESSAGE));
                            for (int i = 0; i <= 4; i++) {
                                if (nc == caja[i].getNumero_cuenta()) {
                                    nv = i;
                                    JOptionPane.showMessageDialog(null, "CUENTA ENCONTRADA");
                                    sali=caja[i].getSaldo();
                                    i = 10;
                                    b = -1;
                                    h = 1;
                                    ce = true;
                                } else {
                                    ce = false;
                                }
                            }
                            if (ce == false) {
                                JOptionPane.showMessageDialog(null, "CUENTA NO ENCONTRADA");
                            }
                        }
                        if (op2 == 2) {
                            h = 1;
                            b = -1;
                        }
                    }
                } catch (java.lang.NumberFormatException ex) {
                    b = -1;

                }
            }
            n = op2;
        }
        return ce;
    }

    public static boolean validarPinc(boolean pv) {
//      pin Cuentas de Corrientes'
        int in = 3;
        while (in > 0) {
            pin[0] = new TransaccionValidacionPIN(1245, 111, id, fechaA(), "Cuenta Corriente");
            pin[1] = new TransaccionValidacionPIN(8875, 111, id, fechaA(), "Cuenta Corriente");
            pin[2] = new TransaccionValidacionPIN(4126, 111, id, fechaA(), "Cuenta Corriente");
            pin[3] = new TransaccionValidacionPIN(2487, 111, id, fechaA(), "Cuenta Corriente");
            pin[4] = new TransaccionValidacionPIN(6132, 111, id, fechaA(), "Cuenta Corriente");
            int p = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el PIN de seguridad", "PIN", JOptionPane.QUESTION_MESSAGE));
            
            if (p == pin[nv].getPINanterior()) {
                JOptionPane.showMessageDialog(null, "PIN CORRECTO");
                pv = true;
                n = in;
                in = 0;

            } else {
                JOptionPane.showMessageDialog(null, "PIN INCORRECTA");
                in = in - 1;
                if (in <= 0) {
                    pv = false;
                } else {
                    if (in == 1) {
                        JOptionPane.showMessageDialog(null, "TE QUEDAN " + in + " INTENTO");
                    } else {
                        JOptionPane.showMessageDialog(null, "TE QUEDAN " + in + " INTENTOS");
                    }

                }
                n = in;
            }

        }

        return pv;

    }

    public static boolean validarPinh(boolean pv) {
//      pin Cuentas de Corrientes'
        int in = 3;
        while (in > 0) {
            pin[0] = new TransaccionValidacionPIN(4512, 111, id, fechaA(), "Cuenta de Ahorros");
            pin[1] = new TransaccionValidacionPIN(7588, 111, id, fechaA(), "Cuenta de Ahorros");
            pin[2] = new TransaccionValidacionPIN(2641, 111, id, fechaA(), "Cuenta de Ahorros");
            pin[3] = new TransaccionValidacionPIN(8724, 111, id, fechaA(), "Cuenta de Ahorros");
            pin[4] = new TransaccionValidacionPIN(3261, 111, id, fechaA(), "Cuenta de Ahorros");
            int p = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el PIN de seguridad", "PIN", JOptionPane.QUESTION_MESSAGE));
            if (p == pin[nv].getPINanterior()) {
                JOptionPane.showMessageDialog(null, "PIN CORRECTO");
                pv = true;
                n = in;
                in = 0;

            } else {
                JOptionPane.showMessageDialog(null, "PIN INCORRECTA");
                in = in - 1;
                if (in <= 0) {
                    pv = false;
                } else {
                    if (in == 1) {
                        JOptionPane.showMessageDialog(null, "TE QUEDAN " + in + " INTENTO");
                    } else {
                        JOptionPane.showMessageDialog(null, "TE QUEDAN " + in + " INTENTOS");
                    }

                }
                n = in;
            }
        }

        return pv;

    }

    public static void ConsultaCorriente() {
        consulta.setTipo(cuentaco[nv].getTipo());
        consulta.setFecha(fechaA());
        consulta.setIDdetransaccion(id);
        m = m + "ID de Transaccion : " + consulta.getIDdetransaccion() + "\nTipo de cuenta : " + consulta.getTipo();
        m = m + "\nPropietario : " + cuentaco[nv].getPropietario() + "\nFecha : " + consulta.getFecha();
        m = m + "\nSaldo Actual : " + cuentaco[nv].getSaldo();
        consulta.Procesamientodeconsultas(m);
    }

    public static void ConsultaAhorros() {
        consulta.setTipo(caja[nv].getTipo());
        consulta.setFecha(fechaA());
        consulta.setIDdetransaccion(id);
        m = m + "ID de Transaccion : " + consulta.getIDdetransaccion() + "\nTipo de cuenta : " + consulta.getTipo();
        m = m + "\nPropietario : " + caja[nv].getPropietario() + "\nFecha : " + consulta.getFecha();
        m = m + "\nSaldo Actual : " + caja[nv].getSaldo();
        consulta.Procesamientodeconsultas(m);
    }

    public static void transferencia() {
        int f = 0;
        while (f == 0) {
            try {
                String tipos = (JOptionPane.showInputDialog(null, "Selecciona el tipo de cuenta", " ",
                        JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecciona", "Cuenta Corriente", "Cuenta de Ahorros"},
                        "Selecciona")).toString();
                if ("Cuenta Corriente".equals(tipos)) {
                    t = 0;
                    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de cuenta"));
                    for (int i = 0; i < 5; i++) {
                        if (numero == cuentaco[i].getNumero_cuenta()) {
                            JOptionPane.showMessageDialog(null, "CUENTA ENCONTRADA");
                            sali = cuentaco[i].getSaldo();
                            transferencia.numero_cuenta = cuentaco[i].getNumero_cuenta();
                            transferencia.tipo = cuentaco[i].getTipo();
                            transferencia.saldo = cuentaco[i].getSaldo();
                            double monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Monto a traferir"));
                            if (c == 0) {
                                if (monto >= 10 && monto <= cuentaco[nv].getSaldo()) {
                                    mf = monto;
                                    cuentaco[nv].debito(monto);
                                    cuentaco[i].credito(monto);
                                    JOptionPane.showMessageDialog(null, "TRANSFERENCIA EXITOSA");
                                    j = i;
                                    f = 1;
                                    cp=1;
                                } else {
                                    if (monto > cuentaco[nv].getSaldo()) {
                                        JOptionPane.showMessageDialog(null, "FONDOS INSUFICIENTES", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                                    } else {
                                        if (monto < 10) {
                                            JOptionPane.showMessageDialog(null, "SOLO SE PERMITE TRANSFERENCIAS DE DE 10$ HACIA DELANTE", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                                        }
                                    }
                                }
                            } else {
                                if (c == 1) {
                                    if (monto >= 5 && monto <= caja[nv].getSaldo()) {
                                        mf = monto;
                                        caja[nv].debito(monto);
                                        cuentaco[i].credito(monto);
                                        JOptionPane.showMessageDialog(null, "TRANSFERENCIA EXITOSA");
                                        j = i;
                                        cp=1;
                                    } else {
                                        if (monto > caja[nv].getSaldo()) {
                                            JOptionPane.showMessageDialog(null, "FONDOS INSUFICIENTES", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                                        } else {
                                            if (monto < 10) {
                                                JOptionPane.showMessageDialog(null, "SOLO SE PERMITE TRANSFERENCIAS DE DE 10$ HACIA DELANTE", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                                            }
                                        }
                                    }

                                }
                            }
                        } else {

                        }
                    }
                    if (j == 5) {
                        JOptionPane.showMessageDialog(null, "CUENTA NO ENCONTRADA");
                        f = 1;
                    }
                } else {

                    if ("Cuenta de Ahorros".equals(tipos)) {
                        t = 1;
                        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de cuenta"));
                        for (int i = 0; i < 5; i++) {
                            if (numero == caja[i].getNumero_cuenta()) {
                                JOptionPane.showMessageDialog(null, "CUENTA ENCONTRADA");
                                transferencia.numero_cuenta = caja[i].getNumero_cuenta();
                                transferencia.tipo = caja[i].getTipo();
                                f = 1;
                                transferencia.saldo = caja[i].getSaldo();
                                sali = caja[i].getSaldo();
                                double monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Monto a traferir"));
                                if (c == 0) {
                                    if (monto >= 10 && monto <= caja[nv].getSaldo()) {
                                        mf = monto;
                                        transR.extraccion(monto);
                                        cuentaco[nv].debito(monto);
                                        caja[i].credito(monto);
                                        JOptionPane.showMessageDialog(null, "TRANSFERENCIA EXITOSA");
                                        j = i;
                                        cp=1;
                                    } else {
                                        if (monto > caja[nv].getSaldo()) {
                                            JOptionPane.showMessageDialog(null, "FONDOS INSUFICIENTES", "TRANSFERENCIA FALLIDA", JOptionPane.WARNING_MESSAGE);
                                        } else {
                                            if (monto < 10) {
                                                JOptionPane.showMessageDialog(null, "SOLO SE PERMITE TRANSFERENCIAS DE DE 10$ HACIA DELANTE", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                                            }
                                        }
                                    }
                                } else {
                                    if (c == 1) {
                                        if (monto >= 5 && monto <= caja[nv].getSaldo()) {
                                            mf = monto;
                                            transR.extraccion(monto);
                                            caja[nv].debito(monto);
                                            caja[i].credito(monto);
                                            JOptionPane.showMessageDialog(null, "TRANSFERENCIA EXITOSA");
                                            f = 1;
                                            j = i;
                                            cp=1;
                                        } else {
                                            if (monto > caja[nv].getSaldo()) {
                                                JOptionPane.showMessageDialog(null, "FONDOS INSUFICIENTES", "TRANSFERENCIA FALLIDA", JOptionPane.WARNING_MESSAGE);
                                            } else {
                                                if (monto < 10) {
                                                    JOptionPane.showMessageDialog(null, "SOLO SE PERMITE TRANSFERENCIAS DE DE 10$ HACIA DELANTE", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                                                }
                                            }
                                        }
                                    }
                                }

                            }
                        }
                        if (j == 5) {
                            JOptionPane.showMessageDialog(null, "CUENTA NO ENCONTRADA");
                            f = 1;
                        }
                    } else {
                        if ("Selecciona".equals(tipos)) {
                            JOptionPane.showMessageDialog(null, "Seleccionar una opcion", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            } catch (java.lang.NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "TRANSFERENCIA CANCELADA");
                f = 1;
            }
        }
    }

    public static void ComprobanteT() {
        String[] cop = {"SI", "NO"};
        int cm = JOptionPane.showOptionDialog(null, "Desea Imprimir un comprobante", "COMPROBANTE", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, cop, cop[0]);
        if (cm == 0) {
            if (c == 0) {

                m = m + "Datos de Cuenta a Transferir\n";
                if (t == 0) {
                    m = m + "Propietario : " + cuentaco[j].getPropietario() + "\n";
                } else {
                    if (t == 1) {
                        m = m + "Propietario : " + caja[j].getPropietario() + "\n";
                    }
                }
                m = m + "Numero de Cuenta : " + transferencia.getNumero_cuenta() + "\n";
                m = m + "Numero de Cuenta : " + transferencia.getTipo() + "\n";
                m = m + "Saldo inicial : " + sali + "\n";
                m = m + "Monto Acreditado : +" + mf + "\n";
                m = m + "Saldo actual : " + transferencia.getSaldo() + "\n";
                m = m + "++++++++++++++++++++++++++++++++++++++++++++++\n";
                m = m + "Datos de Cuenta Que la Realiza\n";
                m = m + "Propietario : " + cuentaco[nv].getPropietario() + "\n";
                m = m + "Numero de Cuenta : " + cuentaco[nv].getNumero_cuenta() + "\n";
                m = m + "Tipo de cuenta : " + cuentaco[nv].getTipo() + "\n";
                m = m + "Monto debitado : -" + mf + "\n";
                m = m + "Saldo actual : " + cuentaco[nv].getSaldo() + "\n";
                JOptionPane.showMessageDialog(null, m, "COMPROBANTE DE TRANFERENCIA", JOptionPane.PLAIN_MESSAGE);
            } else {
                if (c == 1) {
                    m = m + "Datos de Cuenta a Transferir\n";
                    if (t == 0) {
                        m = m + "Propietario : " + cuentaco[j].getPropietario() + "\n";
                    } else {
                        if (t == 1) {
                            m = m + "Propietario : " + caja[j].getPropietario() + "\n";
                        }
                    }
                    m = m + "Numero de Cuenta : " + transferencia.getNumero_cuenta() + "\n";
                    m = m + "Tipo de cuenta : " + transferencia.getTipo() + "\n";
                    m = m + "Saldo inicial : " + sali + "\n";
                    m = m + "Monto Acreditado : +" + mf + "\n";
                    m = m + "Saldo actual : " + transferencia.getSaldo() + "\n";
                    m = m + "++++++++++++++++++++++++++++++++++++++++++++++\n";
                    m = m + "Datos de Cuenta Que la Realiza\n";
                    m = m + "Propietario : " + caja[nv].getPropietario() + "\n";
                    m = m + "Numero de Cuenta : " + caja[nv].getNumero_cuenta() + "\n";
                    m = m + "Tipo de cuenta : " + caja[nv].getTipo() + "\n";
                    m = m + "Monto debitado : -" + mf + "\n";
                    m = m + "Saldo actual : " + caja[nv].getSaldo() + "\n";
                    JOptionPane.showMessageDialog(null, m, "COMPROBANTE DE TRANFERENCIA", JOptionPane.PLAIN_MESSAGE);
                }

            }
        }
    }
    
    public static void ComprobanteR() {
        String[] cop = {"SI", "NO"};
        int cm = JOptionPane.showOptionDialog(null, "Desea Imprimir un comprobante", "COMPROBANTE", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, cop, cop[0]);
        if (cm == 0) {
            if (c == 0) {

                m = m + "Datos de de Transaccion de Retiro\n";
                m = m + "Propietario : " + cuentaco[nv].getPropietario() + "\n";
                m = m + "Numero de Cuenta : " + cuentaco[nv].getNumero_cuenta() + "\n";
                m = m + "Tipo de cuenta : " + cuentaco[nv].getTipo() + "\n";
                m = m + "Saldo Inicial: " + sali + "\n";
                m = m + "Monto debitado : -" + mf + "\n";
                m = m + "Saldo actual : " + cuentaco[nv].getSaldo() + "\n";
                JOptionPane.showMessageDialog(null, m, "COMPROBANTE DE TRANFERENCIA", JOptionPane.PLAIN_MESSAGE);
            } else {
                if (c == 1) {
                    m = m + "Datos de de Transaccion de Retiro\n";
                    m = m + "Propietario : " + caja[nv].getPropietario() + "\n";
                    m = m + "Numero de Cuenta : " + caja[nv].getNumero_cuenta() + "\n";
                    m = m + "Tipo de cuenta : " + caja[nv].getTipo() + "\n";
                    m = m + "Saldo Inicial: " + sali + "\n";
                    m = m + "Monto debitado : -" + mf + "\n";
                    m = m + "Saldo actual : " + cuentaco[nv].getSaldo() + "\n";
                    JOptionPane.showMessageDialog(null, m, "COMPROBANTE DE TRANFERENCIA", JOptionPane.PLAIN_MESSAGE);
                }

            }
        }
    }
    public static void ComprobanteD() {
        String[] cop = {"SI", "NO"};
        int cm = JOptionPane.showOptionDialog(null, "Desea Imprimir un comprobante", "COMPROBANTE", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, cop, cop[0]);
        if (cm == 0) {
            if (c == 0) {

                m = m + "Datos de de Transaccion de Deposito\n";
                m = m + "Propietario : " + cuentaco[nv].getPropietario() + "\n";
                m = m + "Numero de Cuenta : " + cuentaco[nv].getNumero_cuenta() + "\n";
                m = m + "Tipo de cuenta : " + cuentaco[nv].getTipo() + "\n";
                m = m + "Saldo Inicial: " + sali + "\n";
                m = m + "Monto Acreditado : +" + mf + "\n";
                m = m + "Saldo actual : " + cuentaco[nv].getSaldo() + "\n";
                JOptionPane.showMessageDialog(null, m, "COMPROBANTE DE TRANFERENCIA", JOptionPane.PLAIN_MESSAGE);
            } else {
                if (c == 1) {
                    m = m + "Datos de de Transaccion de Deposito\n";
                    m = m + "Propietario : " + caja[nv].getPropietario() + "\n";
                    m = m + "Numero de Cuenta : " + caja[nv].getNumero_cuenta() + "\n";
                    m = m + "Tipo de cuenta : " + caja[nv].getTipo() + "\n";
                    m = m + "Saldo Inicial: " + sali + "\n";
                    m = m + "Monto Acreditado : +" + mf + "\n";
                    m = m + "Saldo actual : " + cuentaco[nv].getSaldo() + "\n";
                    JOptionPane.showMessageDialog(null, m, "COMPROBANTE DE TRANFERENCIA", JOptionPane.PLAIN_MESSAGE);
                }

            }
        }
    }
}
