import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class StickersCreator {
    public void cria() throws Exception{

        // Leitura da imagem 
        BufferedImage imagemOriginal = ImageIO.read(new File("entrada/filme.jpg"));

        // Criar nova imagem com transparencia e com o tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // Copiar a imagem  original pra novo imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // Escrever uma nova imagem 

        // Escrever a nova imagem em novo arquivo
        ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));

    }

    public static void main(String[] args) throws Exception {
        var geradora = new StickersCreator();
        geradora.cria();
    
    }
}
