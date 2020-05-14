
{% for question in include.questions %}
> ## Question {{ question.id }}
> 
> {% include {{ question.description }} %}
>
>{:.answers}
> {% for a in question.answers %}
>  {% if a.correct %}
>- {:.answer .correct} [ ] {{ a.text }}
>  {% else %}
>- {:.answer } [ ] {{ a.text }}
>  {% endif %}
> {% endfor %}
{: .question style="display:none"}
> ## Solution for Question {{ question.id }}
> 
> {% include {{ question.solution }} %}
>
{: .solution style="display:none"}
{% endfor %}

<script type="text/javascript">
  {% include quiz.js %}

  startQuiz({{ include.totalQuestionCount }}, {{ include.quizQuestionCount }});
</script>