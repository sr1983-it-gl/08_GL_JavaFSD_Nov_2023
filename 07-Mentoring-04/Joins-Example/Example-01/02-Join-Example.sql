
select * from small_case_alphabets;

select * from capital_case_alphabets;

-- Syntax 1
select * from small_case_alphabets as sca
	inner join (
		select * from capital_case_alphabets
    ) as cca;
    
-- Syntax 2
select * from small_case_alphabets, capital_case_alphabets;

    
select * from t_colors;

select * from small_case_alphabets, capital_case_alphabets,
t_colors;

