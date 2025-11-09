package com.example.demo.config;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public void run(String... args) throws Exception {
        if (productoRepository.count() == 0) {
            productoRepository.save(Producto.builder()
                .nombre("Laptop Gamer X15")
                .precio(1200000)
                .categoria("Computadoras")
                .imagen("https://res.cloudinary.com/decwoxmrc/image/upload/v1761457932/notebook_dhunri.webp")
                .build());

            productoRepository.save(Producto.builder()
                .nombre("PC Ryzen 5600")
                .precio(800000)
                .categoria("Computadoras")
                .imagen("https://res.cloudinary.com/decwoxmrc/image/upload/v1761457932/pc_gamer_g7lwk3.webp")
                .build());

            productoRepository.save(Producto.builder()
                .nombre("PlayStation 5")
                .precio(450000)
                .categoria("Consolas")
                .imagen("https://res.cloudinary.com/decwoxmrc/image/upload/v1761457933/playstation5_taguaa.webp")
                .build());

            productoRepository.save(Producto.builder()
                .nombre("Joystick Xbox Inalambrico")
                .precio(35000)
                .categoria("Accesorios")
                .imagen("https://res.cloudinary.com/decwoxmrc/image/upload/v1762660281/joystick_bwrqcl.webp")
                .build());

            productoRepository.save(Producto.builder()
                .nombre("Monitor 24'' 144Hz")
                .precio(120000)
                .categoria("Periféricos")
                .imagen("https://res.cloudinary.com/decwoxmrc/image/upload/v1761457932/monitor144_xtok4j.webp")
                .build());
        }
    }
}