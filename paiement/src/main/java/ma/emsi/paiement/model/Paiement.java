package ma.emsi.paiement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.donation.model.Donation;

import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String paymentMethod; // e.g., "credit card", "PayPal"

    @OneToOne
    @JoinColumn(name = "donation_id")
    private Donation donation;

    // Getters and Setters
}

