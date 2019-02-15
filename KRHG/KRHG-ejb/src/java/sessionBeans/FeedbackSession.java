/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entity.Feedback;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Anselm
 */
@Stateless
public class FeedbackSession implements FeedbackSessionLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Feedback> getAllFeedbacks() {
        Query q;
        q = em.createQuery("SELECT f FROM Feedback f");
        return q.getResultList();
    }

    @Override
    public Feedback getFeedbackByID(Long fID) {
        Feedback f = em.find(Feedback.class, fID);

        if (f != null) {
            return f;
        } else {
            throw new NoResultException("Not found");
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public void deleteFeedback(Long fID) {
        Feedback f = em.find(Feedback.class, fID);

        if (f != null) {
            em.remove(f);
        } else {
            throw new NoResultException("Not found");
        }
    }

    @Override
    public void createFeedback(Feedback f) {
        em.persist(f);
    }

}
