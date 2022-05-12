import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	
	private List<Hotel> hoteis = new ArrayList<Hotel>();
	
	
	//instancia os hoteis
    public HotelReservation() {
    	
		Hotel lakewood = new Hotel("Lakewood", 110, 90, 80, 80, 3);
		Hotel bridgewood = new Hotel("Bridgewood", 160, 60, 110, 50, 4);
		Hotel ridgewood = new Hotel("Ridgewood", 220, 150, 100, 40, 5);
		
		hoteis.add(lakewood);
		hoteis.add(bridgewood);
		hoteis.add(ridgewood);
	}

	public String getCheapestHotel (String input) {
    	
    	//separa a entrada em um array de strings
    	String[] listaInput = input.split(" ");
    	int diasNormais = 0;
    	int fimDeSemana = 0;
    	
    	//conta os dias normais e fds na entrada
    	for(int i=1; i<listaInput.length; i++) {
    		if(listaInput[i].contains("sat") || listaInput[i].contains("sun")) {
    			fimDeSemana++;
    		}
    		if(listaInput[i].contains("mon") || listaInput[i].contains("tues") || listaInput[i].contains("wed") || listaInput[i].contains("thur") || listaInput[i].contains("fri")) {
    			diasNormais++;
    		}
    	}
    	
    	//chama o metodo que vai devolver o nome do hotel mais barato
    	return calculateBestPriceHotel(listaInput[0], diasNormais, fimDeSemana);
    }
    
    private String calculateBestPriceHotel(String tipoCliente, int diasNormais, int fimDeSemana) {

    	//variavel que guarda o atual menor valor e estrela do hotel
    	int atualHotelMaisBarato = Integer.MAX_VALUE;
    	
    	//variavel que grava o valor do hotel da instancia atual
    	int precoHotel = 0;
    	
    	//objeto que grava o hotel mais barato
    	Hotel hotelMaisBarato = null;
    	
    	//laco que calcula o valor de todos os hoteis e escolhe o mais barato
    	for(int i=0; i<hoteis.size(); i++) {
    		
    		//calcula o preco do hotel
    		if(tipoCliente.contains("Regular")) {
    			precoHotel = hoteis.get(i).getPrecoDiaSemanaRegular() * diasNormais + hoteis.get(i).getPrecoFimDeSemanaRegular() * fimDeSemana;
    		}
    		else if(tipoCliente.contains("Reward")) {
    			precoHotel = hoteis.get(i).getPrecoDiaSemanaReward() * diasNormais + hoteis.get(i).getPrecoFimDeSemanaReward() * fimDeSemana;
    		}
    		
    		//se for igual o menor valor, confere se o atual hotel tem mais estrelas
    		if(atualHotelMaisBarato == precoHotel) {
    			if(hoteis.get(i).getEstrela() > hotelMaisBarato.getEstrela()) {
    				hotelMaisBarato = hoteis.get(i);
    			}
    		}
    		
    		//confere se o preco do hotel atual eh menor que o menor valor salvo
    		if(atualHotelMaisBarato > precoHotel) {
    			hotelMaisBarato = hoteis.get(i);
    			atualHotelMaisBarato = precoHotel;
    		}
    		
    	}
    	
    	//retorna o nome do hotel mais barato
    	return hotelMaisBarato.getNome();
    }
}
