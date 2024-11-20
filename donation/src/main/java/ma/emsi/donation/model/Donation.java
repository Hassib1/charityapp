package ma.emsi.donation.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.organisation.model.Organisation;
import ma.emsi.user.model.Utilisateur;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;
    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organisation organization;

    private LocalDate donationDate;

    // Getters and setters
}

