package br.com.cantina.newton;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Cantina
{
    public static void main(String[] args)
    {

        String nomeCliente = JOptionPane.showInputDialog("Qual é o seu nome ? ");
        String tipoMassa = JOptionPane.showInputDialog("Qual massa ? ");
        Double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Valor da massa:  "));


        Cliente cliente = new Cliente();
        cliente.nome = nomeCliente;

        Massa massa = new Massa();
        massa.tipo = tipoMassa;
        massa.valor = valorMassa;


        String menu = JOptionPane.showInputDialog("\n 1 - Bacon\n 2 - Mussarela\n 3 - Tomate\n 4 - Queijo\n 5 - Sair ");


        Ingrediente ingredientes = new Ingrediente();
        try
        {

            while (!menu.equals("5"))
            {


                if (menu.equals("1")) {ingredientes.nome = "Bacon";}

                if (menu.equals("2")) {ingredientes.nome = "Mussarela";}

                if (menu.equals("3")) {ingredientes.nome = "Tomate";}

                if (menu.equals("4")) {ingredientes.nome = "Queijo";}

                if (!(menu.equals("1") && menu.equals("2") && menu.equals("3") && menu.equals("4")))
                {
                    throw new Exception("Não existe o ingrediente selecionado");
                }

                menu = JOptionPane.showInputDialog("\n 1 - Bacon\n 2 - Mussarela\n 3 - Tomate" +
                        "\n 4 - Queijo\n 5 - Sair ");


                Double valorFinal = massa.valor + 2;

                JOptionPane.showMessageDialog(null, "Pedido feito para " + cliente.nome
                        + "\n" + massa.tipo + " com " + ingredientes.nome + "\n Valor: " + valorFinal);
            }
        } catch (Exception ex)
        {System.out.println(ex.getMessage());}

    }
}