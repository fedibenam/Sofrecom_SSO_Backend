package org.example.Repository.softachat;

import org.example.Entity.softachat.SuiviDA;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

@Repository
public interface SuiviDARepository extends JpaRepository<SuiviDA, Long> {

    @Query(value = """
        SELECT
            da.nom_demandeur,
            da.dac_id,
            da.code AS da_code,
            da.description,
            da.statut AS statut_da,
            da.fournisseur,
            da.devise,
            da.dac_dat_deb_livraison,
            da.dac_dat_fin_livraison,
            da.date_creation AS date_creation_da,

            fact.code_fact,
            fact.prix_fact,
            fact.prix_fact_ttc,
            fact.nom_createur_fact,
            fact.satut_fact AS statut_fact,
            fact.date_creation_fact,
            fact.code_bc,
            fact.statut_bc
        FROM 
            suivi_da da 
        LEFT JOIN 
            suivi_fact_bc fact ON da.dac_id = fact.dac_id 
        WHERE 
            da.nom_demandeur = :nomDemandeur
        ORDER BY 
            da.date_creation DESC
    """, nativeQuery = true)
    List<Map<String, Object>> findByNomDemandeur(@Param("nomDemandeur") String nomDemandeur);
}
