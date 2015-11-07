package github.hxfirefox.texaspoker.game;

import com.google.common.collect.Lists;
import github.hxfirefox.texaspoker.poker.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ���� on 15-11-6.
 */
public class Round {
    private List<Card> cardList = Lists.newArrayList();

    public Round(Card... cards) {
        Collections.addAll(cardList, cards);
    }

    public List<Card> getAllCards() {
        return new ArrayList<Card>(cardList);
    }

    @Override
    public String toString() {
        final StringBuilder output = new StringBuilder();
        for (Card card:cardList) {
            output.append(card.toString());
        }
        return output.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Round round = (Round) o;

        return cardList.equals(round.cardList);

    }

    @Override
    public int hashCode() {
        return cardList.hashCode();
    }
}
