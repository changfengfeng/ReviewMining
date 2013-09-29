package ml.topicModel.ASUM;

import java.util.List;

import ml.topicModel.common.data.Sentence;

public class Document{
    List<Sentence> sentences;
    
    public void setSentences(List<Sentence> sentences){
        this.sentences = sentences;
    }
    
    public int getNumOfSentences(){
        return sentences.size();
    }
    
    public Sentence getSentence(int index){
        return sentences.get(index);
    }
}
