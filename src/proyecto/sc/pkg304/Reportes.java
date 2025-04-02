package proyecto.sc.pkg304;

import javax.swing.JOptionPane;

public class Reportes {
    private GestorCajas gestorCajas;

    public Reportes(GestorCajas gestorCajas) {
        this.gestorCajas = gestorCajas;
    }

    public void mostrarReporte() {
        Caja cajaMayorClientes = gestorCajas.getCajaMayorClientes();
        int totalClientes = gestorCajas.getTotalClientesAtendidos();
        Caja cajaMejorTiempo = gestorCajas.getCajaMejorTiempoPromedio();
        double promedioGeneral = gestorCajas.getPromedioAtencionGeneral();

        String mensaje = "Reporte de Cajas:\n" +
                "1. Caja con más clientes: " + (cajaMayorClientes != null ? cajaMayorClientes.getNombre() : "N/A") + "\n" +
                "2. Total de clientes atendidos: " + totalClientes + "\n" +
                "3. Caja con mejor tiempo promedio: " + (cajaMejorTiempo != null ? cajaMejorTiempo.getNombre() : "N/A") + "\n" +
                "4. Tiempo promedio de atención general: " + String.format("%.2f", promedioGeneral) + " minutos";

        JOptionPane.showMessageDialog(null, mensaje, "Reporte de Atención", JOptionPane.INFORMATION_MESSAGE);
    }
}
