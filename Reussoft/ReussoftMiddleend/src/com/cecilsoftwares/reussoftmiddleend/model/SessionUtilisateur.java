package com.cecilsoftwares.reussoftmiddleend.model;

import java.util.Date;

/**
 * @author Plamedi L. Lusembo
 */
public class SessionUtilisateur {

    private final int code;
    private final Collaborateur collaborateur;
    private final String action;
    private final Date dateHeure;

    public SessionUtilisateur(SessionUtilisateurBuilder sessionUtilisateurBuilder) {
        code = sessionUtilisateurBuilder.code;
        collaborateur = sessionUtilisateurBuilder.collaborateur;
        action = sessionUtilisateurBuilder.action;
        dateHeure = sessionUtilisateurBuilder.dateHeure;
    }

    public int getCode() {
        return code;
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public String getAction() {
        return action;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public static class SessionUtilisateurBuilder {

        private int code;
        private Collaborateur collaborateur;
        private String action;
        private Date dateHeure;

        public SessionUtilisateurBuilder(int code) {
            this.code = code;
        }

        public SessionUtilisateurBuilder collaborateur(Collaborateur collaborateur) {
            this.collaborateur = collaborateur;
            return this;
        }

        public SessionUtilisateurBuilder action(String action) {
            this.action = action;
            return this;
        }

        public SessionUtilisateurBuilder dateHeure(Date dateHeure) {
            this.dateHeure = dateHeure;
            return this;
        }

        public SessionUtilisateur build() {
            return new SessionUtilisateur(this);
        }

    }

}
